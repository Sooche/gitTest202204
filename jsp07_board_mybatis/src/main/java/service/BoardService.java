package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.BoardDAO;
import dao.BoardfileDAO;
import dao.ReplyDAO;
import dto.Board;
import dto.Boardfile;

public class BoardService {
	private BoardDAO boardDAO = new BoardDAO();
	private BoardfileDAO boardfileDAO = new BoardfileDAO(); 
	private ReplyDAO replyDAO =new ReplyDAO();
	
	public void insert(Board board, List<String> filenames) {
		//게시물 저장
		int cnt =boardDAO.insert(board);
		System.out.println(cnt +"건 보드 추가");
		System.out.println("service" + board);
		//게시물 파일저장
		//bnum 는 board 저장시 생성 (board mapper 에서 selctKey로 세팅)
		for(String filename:filenames) {
			Boardfile boardfile =new Boardfile();
			boardfile.setBnum(board.getBnum());
			boardfile.setFilename(filename);
			
		 cnt +=boardfileDAO.insert(boardfile);
		}
		System.out.println(cnt +"개의 파일 추가");
		
	}
	public List<Board> selectList (Map<String,Object> findmap) {
		
		int curPage = (int)findmap.get("curPage");
		
		//페이징 처리
		int perPage =10; //한페이지의 게시물수
		
		int startnum = (curPage-1)*perPage +1; //시작
		int endnum =startnum + perPage -1; //끝번호
		findmap.put("startnum", startnum);
		findmap.put("endnum", endnum);
		
		//페이징 블럭 처리
		//전체 게시물수
		
		int totCnt = boardDAO.select_totalcnt(findmap);
		
		int totPage = totCnt / perPage;
		if(totCnt % perPage >0) totPage++;
		findmap.put("totPage", totPage);
		
		
		int perBlock = 10;
		int startPage = curPage-((curPage -1)%perBlock);
		int endPage = startPage + perBlock -1;
		
		//endPage 수정
		if(endPage>totPage) endPage = totPage;
		
		findmap.put("startPage", startPage);
		findmap.put("endPage", endPage);
		

		
		System.out.println("findmap"+findmap);
		return boardDAO.selectList(findmap);
	
		
		
	}
	public Board selectOne(int bnum) {
		
		return boardDAO.selectOne(bnum);
	}
	
	public void delete (int bnum) {
		//댓글 삭제 자식부터 삭제
		int cnt = replyDAO.delete_bnum(bnum);
		System.out.println(cnt +"건 reply 삭제");
		
		
		//게시물 파일 삭제 자식부터 삭제
		 cnt =boardfileDAO.delete_bnum(bnum);
		System.out.println(cnt + "건 삭제");
		//게시물 삭제 부모
		 cnt = boardDAO.delete(bnum);
		System.out.println(cnt +"건 삭제");
		
	}
	
	
	public void update(Board board, List<String> filenames,String[] removefiles) {
		//게시물수정
		boardDAO.update(board);
		
		//추가할파일들추가
		for(String filename:filenames) {
			Boardfile boardfile = new Boardfile();
			boardfile.setBfnum(board.getBnum());
			boardfile.setFilename(filename);
			boardfileDAO.insert(boardfile);
			
		}
		//파일들 삭제 
		if(removefiles ==null) return;
		for(String bfnum:removefiles) {
			boardfileDAO.delete(Integer.parseInt(bfnum));
			
		}
		
	}
	
	
	public void update_readcnt(int bnum) {
		boardDAO.update_readcnt(bnum);
		
	}
	
}

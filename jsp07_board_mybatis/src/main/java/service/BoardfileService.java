package service;

import java.util.List;

import dao.BoardfileDAO;
import dto.Boardfile;

public class BoardfileService {
	private BoardfileDAO boardfileDAO = new BoardfileDAO();
	public List<Boardfile> selectList(int bnum){
		
	 return boardfileDAO.selectList(bnum);	
	
	}
	

}

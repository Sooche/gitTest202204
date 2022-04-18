package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.Boardfile;

public class BoardfileDAO {
	public int insert(Boardfile boardfile) {
		try(SqlSession session = MBConn.getSession()){
			return session.insert("BoardfileMapper.insert", boardfile);
		}
	}
	
	public int update(Boardfile boardfile) {
		try(SqlSession session = MBConn.getSession()){
			return session.update("BoardfileMapper.update", boardfile);
		}
	}
	
	public int delete(int bfnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.delete("BoardfileMapper.delete", bfnum);
		}
	}
	public int delete_bnum(int bnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.delete("BoardfileMapper.delete_bnum",bnum);
		}
		
	}
	
	
	public Boardfile selectOne(int bfnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.selectOne("BoardfileMapper.selectOne", bfnum);
		}
	}
	//파일의 리스트는 한게시물의 파일들
	public List<Boardfile> selectList(int bnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.selectList("BoardfileMapper.selectList", bnum);
		}
	}
	
}

package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.Reply;

public class ReplyDAO {
	
	public int insert(Reply reply) {
		try(SqlSession session = MBConn.getSession()){
			return session.insert("ReplyMapper.insert",reply);
		}
		
		
	}
	
	public int update(Reply reply) {
		try(SqlSession session = MBConn.getSession()){
			return session.update("ReplyMapper.update",reply);
		}
		
	}
	public int update_restep(Reply reply) {
		try(SqlSession session = MBConn.getSession()){
			return session.update("ReplyMapper.update_restep",reply);
		}
	}
	
	public int delete(int rnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.delete("ReplyMapper.delete",rnum);
		}
	}
		
	public int delete_bnum(int bnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.delete("ReplyMapper.delete_bnum",bnum);
		
	}
	
	}
	public Reply selectOne(int rnum) {
		try(SqlSession session = MBConn.getSession()){
			return session.selectOne("ReplyMapper.selectOne",rnum);
		}
		
	}
	public List<Reply> selectList(int bnum){
		try(SqlSession session = MBConn.getSession()){
			return session.selectList("ReplyMapper.selectList",bnum);
		}
	}
}

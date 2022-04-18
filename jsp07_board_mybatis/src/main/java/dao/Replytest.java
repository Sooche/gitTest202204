package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dto.Reply;

class Replytest {
	ReplyDAO replyDAO = new ReplyDAO();	
	@Test
	void inserttest() {
		Reply reply = new Reply();
		
		reply.setBnum(158);
		reply.setContent("하이네");
		reply.setRestep(1);
		reply.setRelevel(1);
		
		replyDAO.insert(reply);
		
	}

	@Test
	void updatetest() {
Reply reply = new Reply();
		
		
		reply.setContent("하이네");
		reply.setRnum(1);
		
		int cnt = replyDAO.update(reply);
		System.out.println(cnt + "건수정");
		
	}
	@Test
	void deletetest() {
		Reply reply = new Reply();
		
		
	
		reply.setRnum(1);
		
		int cnt = replyDAO.delete(1);
		System.out.println(cnt + "건삭제");
	}
	
	@Test
	void selectOnetest() {				
		 Reply reply= replyDAO.selectOne(8);
		System.out.println(reply);
	}
	@Test
	void selectListtest() {
		List<Reply> rlist = replyDAO.selectList(158);
		System.out.println(rlist);
	}
	
}

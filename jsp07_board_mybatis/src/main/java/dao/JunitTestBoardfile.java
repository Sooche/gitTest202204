package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dto.Boardfile;

class JunitTestBoardfile {
	private BoardfileDAO bfdao = new BoardfileDAO();
	@Test
	void testInsert() {
		Boardfile boardfile = new Boardfile();
		boardfile.setBnum(4);
		boardfile.setFilename("a.png");
		int cnt = bfdao.insert(boardfile);
		System.out.println(cnt+"건 추가");
	}
	
	@Test
	void testUpdate() {
		Boardfile boardfile = new Boardfile();
		boardfile.setBfnum(1);
		boardfile.setFilename("b.png");
		int cnt = bfdao.update(boardfile);
		System.out.println(cnt+"건 수정");
	}
	@Test
	void testDelete() {
		int cnt =  bfdao.delete(2);
		System.out.println(cnt+"건 삭제");
	}

	@Test
	void testSelectOne() {
		Boardfile boardfile =  bfdao.selectOne(2);
		System.out.println(boardfile);
	}

	@Test
	void testSelectList() {
		List<Boardfile> bflist=  bfdao.selectList(4);
		System.out.println(bflist);
	}
}

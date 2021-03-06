package org.casper.mapper;

import java.util.List;

import org.casper.domain.BoardVO;
import org.casper.domain.Criteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
/*
	@Test
	public void testGetList() {
		
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		
		board.setTitle("지금 작성하는 글");
		board.setContent("지금 작성하는 글의 내용");
		board.setWriter("Casper");
		
		mapper.insert(board);
		
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		
		board.setTitle("지금 다시 작성하는 글");
		board.setContent("지금 다시 작성하는 글의 내용");
		board.setWriter("Casper");
		
		mapper.insertSelectKey(board);
		
		log.info(board);
	}
	
	@Test
	public void testRead() {
		
		BoardVO board = mapper.read(3L);
		
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		
		log.info("DELETE COUNT : " + mapper.delete(3L));
	}

	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		
		board.setBno(5L);
		board.setTitle("수정 글");
		board.setContent("수정 글의 내용");
		board.setWriter("Casper");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: " + count);
	}

	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		
		cri.setAmount(10);
		cri.setPageNum(3);
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
*/
	
	@Test
	public void testSearch() {
		Criteria cri = new Criteria();
		cri.setKeyword("지금");
		cri.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}

}

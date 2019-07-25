package org.casper.mapper;

import java.util.List;

import org.casper.domain.BoardVO;
import org.casper.domain.Criteria;

public interface BoardMapper {

	//xml 처리로 인한 주석 처리
	//@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cri);
}

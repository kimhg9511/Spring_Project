package com.kimhg.portfolio.persistence;

import java.util.List;

import com.kimhg.portfolio.domain.BoardVO;
import com.kimhg.portfolio.domain.Criteria;

public interface BoardDAO {
	
	public void create(BoardVO board) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(BoardVO board) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public Integer getMaxBno() throws Exception;
	
	List<BoardVO> listPage(Criteria cri) throws Exception;
	
	int getTotalCount(Criteria cri) throws Exception;
}

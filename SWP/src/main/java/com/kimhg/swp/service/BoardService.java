package com.kimhg.swp.service;

import java.util.List;

import com.kimhg.swp.domain.BoardVO;
import com.kimhg.swp.domain.Criteria;;

public interface BoardService {
	public void regist(BoardVO board) throws Exception;
	public BoardVO read(Integer bno) throws Exception;
	public void modify(BoardVO board) throws Exception;
	public void remove(Integer bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	public void dummy() throws Exception;
	List<BoardVO> listPage(Criteria cri) throws Exception;
	int getTotalCount(Criteria cri) throws Exception;
}

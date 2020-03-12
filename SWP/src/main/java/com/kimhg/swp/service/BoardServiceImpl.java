package com.kimhg.swp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kimhg.swp.domain.BoardVO;
import com.kimhg.swp.persistence.BoardDAO;

//서비스 객체임을 알림
@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public void regist(BoardVO board) throws Exception {
		boardDAO.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return boardDAO.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		boardDAO.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		boardDAO.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return boardDAO.listAll();
	}

	@Override
	public void dummy() throws Exception {
		int maxBno;
		if(boardDAO.getMaxBno() == null)
		{
			maxBno = 0;
		} else {
			maxBno = boardDAO.getMaxBno();
		}
		BoardVO board = new BoardVO();
		for(int i=maxBno+1;i<maxBno+101;i++) {
			board.setTitle("dummytitle"+i);
			board.setContent("더미 게시글");
			board.setWriter("kimhg");
			regist(board);
		}
	}

}

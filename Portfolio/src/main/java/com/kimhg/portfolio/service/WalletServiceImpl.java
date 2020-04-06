package com.kimhg.portfolio.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kimhg.portfolio.domain.WalletVO;
import com.kimhg.portfolio.domain.Criteria;
import com.kimhg.portfolio.persistence.WalletDAO;

//서비스 객체임을 알림
@Service
public class WalletServiceImpl implements WalletService{
	
	@Inject
	private WalletDAO walletDAO;

	@Override
	public WalletVO read(Integer bno) throws Exception {
		return walletDAO.read(bno);
	}

	@Override
	public List<WalletVO> listAll() throws Exception {
		return walletDAO.listAll();
	}

	@Override
	public void dummy() throws Exception {
		/*
		 * int maxBno; if(walletDAO.getMaxBno() == null) { maxBno = 0; } else { maxBno =
		 * walletDAO.getMaxBno(); } WalletVO wallet = new WalletVO(); for(int
		 * i=maxBno+1;i<maxBno+101;i++) { wallet.setTitle("dummytitle"+i);
		 * wallet.setContent("더미 게시글"); wallet.setWriter("kimhg"); regist(wallet); }
		 */
	}
	@Override
	public List<WalletVO> listPage(Criteria cri) throws Exception {
		return walletDAO.listPage(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) throws Exception {
		return walletDAO.getTotalCount(cri);
	}

}

package com.kimhg.portfolio.service;

import java.util.List;

import com.kimhg.portfolio.domain.Criteria;
import com.kimhg.portfolio.domain.WalletVO;
import com.kimhg.portfolio.persistence.WalletDAO;

public class WalletServiceImpl implements WalletService {
	private WalletDAO walletDAO;
	
	@Override
	public List<WalletVO> listPage(Criteria cri) throws Exception {
		return walletDAO.listPage(cri);
	}

}

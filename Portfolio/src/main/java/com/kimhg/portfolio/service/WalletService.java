package com.kimhg.portfolio.service;

import java.util.List;

import com.kimhg.portfolio.domain.WalletVO;
import com.kimhg.portfolio.domain.Criteria;

public interface WalletService {
	public WalletVO read(Integer bno) throws Exception;
	public List<WalletVO> listAll() throws Exception;
	public void dummy() throws Exception;
	List<WalletVO> listPage(Criteria cri) throws Exception;
	int getTotalCount(Criteria cri) throws Exception;
}

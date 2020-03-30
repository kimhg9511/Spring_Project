package com.kimhg.portfolio.service;

import java.util.List;

import com.kimhg.portfolio.domain.Criteria;
import com.kimhg.portfolio.domain.WalletVO;

public interface WalletService {
	List<WalletVO> listPage(Criteria cri) throws Exception;
}

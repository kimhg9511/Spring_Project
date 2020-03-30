package com.kimhg.portfolio.persistence;

import java.util.List;

import com.kimhg.portfolio.domain.Criteria;
import com.kimhg.portfolio.domain.WalletVO;

public interface WalletDAO {
	public List<WalletVO> listPage(Criteria cri) throws Exception;
}

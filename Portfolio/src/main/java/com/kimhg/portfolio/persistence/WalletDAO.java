package com.kimhg.portfolio.persistence;

import java.util.List;

import com.kimhg.portfolio.domain.WalletVO;
import com.kimhg.portfolio.domain.Criteria;

public interface WalletDAO {	
	public WalletVO read(Integer bno) throws Exception;
	
	public List<WalletVO> listAll() throws Exception;
	
	public Integer getMaxBno() throws Exception;
	
	List<WalletVO> listPage(Criteria cri) throws Exception;
	
	int getTotalCount(Criteria cri) throws Exception;
}

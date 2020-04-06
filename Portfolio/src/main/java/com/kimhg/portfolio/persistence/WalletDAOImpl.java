package com.kimhg.portfolio.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kimhg.portfolio.domain.WalletVO;
import com.kimhg.portfolio.domain.Criteria;

@Repository
public class WalletDAOImpl implements WalletDAO{
	@Inject
	private SqlSession session;
	
	private static String NS = "WalletMapper";
	//private static String CREATE = NS + ".create";
	private static String READ = NS + ".read";
	//private static String UPDATE = NS + ".update";
	//private static String DELETE = NS + ".delete";
	private static String LISTALL = NS + ".listAll";
	private static String GETMAXBNO = NS + ".getMaxBno";
	private static String LISTPAGE = NS + ".listPage";
	private static String GETTOTALCOUNT = NS + ".gettotalcount";

	@Override
	public WalletVO read(Integer bno) throws Exception {
		return session.selectOne(READ,bno);
	}

	@Override
	public List<WalletVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(LISTALL);
	}

	@Override
	public Integer getMaxBno() throws Exception {
		return session.selectOne(GETMAXBNO);
	}

	@Override
	public List<WalletVO> listPage(Criteria cri) throws Exception {
		return session.selectList(LISTPAGE,cri);
	}

	@Override
	public int getTotalCount(Criteria cri) throws Exception {
		return session.selectOne(GETTOTALCOUNT,cri);
	}
}

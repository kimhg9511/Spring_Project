package com.kimhg.portfolio.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.kimhg.portfolio.domain.Criteria;
import com.kimhg.portfolio.domain.WalletVO;

public class WalletDAOImpl implements WalletDAO {
	/*SQL문을 실행하는 메소드를 가지고 있는 인터페이스 SqlSession을 구현한 SqlSessionTemplate을 찾아서
	   객체를 자동으로 생성*/
	@Inject
	private SqlSession session;
	
	private static String NS = "WalletMapper";
//	private static String READ = NS + ".read";
//	private static String LISTALL = NS + ".listAll";
//	private static String GETMAXBNO = NS + ".getMaxBno";
	private static String LISTPAGE = NS + ".listPage";
//	private static String GETTOTALCOUNT = NS + ".gettotalcount";
	
	@Override
	public List<WalletVO> listPage(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(LISTPAGE,cri);
	}

}

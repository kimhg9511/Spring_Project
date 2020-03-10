package com.example.sbadmin;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Runner 클래스(테스트 메소드를 실행하는 클래스) 를 SpringJUnit4ClassRunner로 함
@RunWith(SpringJUnit4ClassRunner.class)
//location 속성 경로에 있는 xml 파일을 이용해서 스프링이 로딩됨
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dataSource-context.xml"})

public class MyBatisTest {
	@Inject
	private SqlSessionFactory sqlFactory;

	@Test
	public void testFactory() {
		System.out.println(sqlFactory);
	}

	@Test
	public void testSession() throws Exception {
		try (SqlSession session = sqlFactory.openSession()) {
			System.out.println(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

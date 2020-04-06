# DB Connect Manual

## 1.pom.xml에 dependency 추가

- ### mybatis
- ### mybatis-spring
- ### Mysql,MariaDB,OracleDB etc... DB connector dependency
- ### spring-JDBC

## 2.영속 계층 구현

### contect.xml 파일에 DataSource 등록

- #### driverClassName

- #### url

- #### username

- #### password

  ```xml
  <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
  	<property name="driverClassName" value="com.mysql.jdbc.Driver">		</property> 
  	<property name="url" value="jdbc:mysql://35.200.109.72:3306
  	/testdb?useSSL=false"></property>
  	<property name="username" value="root"></property>
  	<property name="password" value="비~밀"></property>
  </bean>
  ```

### mybatis-config.xml 추가

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration
    PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

</configuration>
```

### SqlSessionFactory 추가

```xml
<!-- sqlSessionFactory -->

<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="dataSource" ref="dataSource"></property>
    <property name="configLocation" value="classpath:/mybatis-config.xml"></property>
    <property name="mapperLocations" value="classpath:mappers/**/*Mapper.xml"></property>
</bean>
```



### SqlSessionTemplate 추가

```xml
<!-- sqlSessionTemplate -->
<bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate"
    destroy-method="clearCache">
    <constructor-arg name="sqlSessionFactory" ref="sqlSessionFactory"></constructor-arg>
</bean>

<!-- com.gguri.swp.persistence 패키지를 자동으로 인식 -->
<context:component-scan base-package="com.gguri.swp.persistence">
</context:component-scan>
```

### Table 생성, Table에 매칭되는 Mapper 생성

- #### CREATE TABLE

- #### src/main/resources 경로에 mappers/*mapper.xml 추가

```xml
<!-- /resource/mappers/boardMapper -->

<?xml version="1.0" encoding="UTF-8"?>

<!-- DTD 선언 -->
<!DOCTYPE mapper
	PUBLIC "-//mybatis.org/DTD Mapper 3.0//EN"
	"http://mybatis.org/dtd/mybatis-3-mapper.dtd">
	
<mapper namespace="BoardMapper">
	<!-- 데이터 삽입 -->
	<insert id="create">
		insert into board (title, content, writer)
		values( #{title}, #{content}, #{writer})
	</insert>	
	<!-- 행 검색 -->
	<select id="read" resultType="com.gguri.swp.domain.BoardVO">
		select *
		from board
		where bno = #{bno}
	</select>
	<!-- 행 수정 -->
	<update id="update">
		update board
		set title = #{title}, content = #{content}
		where bno = #{bno}
	</update>
	<!-- 행 삭제 -->
	<delete id="delete">
		delete from board where bno = #{bno}
	</delete>
	<!-- board 전체 행 조회 -->
	<select id="listAll" resultType="com.gguri.swp.domain.BoardVO">
		select *
		from board
		order by bno desc, regdate desc
	</select>
	<!-- bno 최대 구하기 -->
	<select id="getMaxBno" resultType="Integer">
		select max(bno) from board
	</select>	
</mapper>
```

### VO 구현

```java
package com.gguri.swp.domain;

import java.util.Date;

public class BoardVO {
	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + "]";
	}
	
}
```

### 인터페이스 DAO 작성, DAO 구현

```java
//com.gguri.swp.persistence.BoardDAO

package com.gguri.swp.persistence;

import java.util.List;

import com.gguri.swp.domain.BoardVO;

public interface BoardDAO {
	
	public void create(BoardVO board) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(BoardVO board) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public Integer getMaxBno() throws Exception;
}
```

```java
//BoardDAOImpl.java


package com.gguri.swp.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gguri.swp.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	/*SQL문을 실행하는 메소드를 가지고 있는 인터페이스 SqlSession을 구현한 SqlSessionTemplate을 찾아서
	   객체를 자동으로 생성*/
	@Inject
	private SqlSession session;
	
	private static String NS = "BoardMapper";
	private static String CREATE = NS + ".create";
	private static String READ = NS + ".read";
	private static String UPDATE = NS + ".update";
	private static String DELETE = NS + ".delete";
	private static String LISTALL = NS + ".listAll";
	private static String GETMAXBNO = NS + ".getMaxBno";
	@Override
	public void create(BoardVO board) throws Exception {
		session.insert(CREATE, board);
		
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return session.selectOne(READ,bno);
	}

	@Override
	public void update(BoardVO board) throws Exception {
		session.update(UPDATE, board);
		
	}

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(DELETE, bno);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(LISTALL);
	}

	@Override
	public Integer getMaxBno() throws Exception {
		return session.selectOne(GETMAXBNO);
	}
}
```

###### TEST Files

```java
//DataSourceTest.java


package com.gguri.swp;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Runner 클래스(테스트 메소드를 실행하는 클래스) 를 SpringJUnit4ClassRunner로 함
@RunWith(SpringJUnit4ClassRunner.class)
//location 속성 경로에 있는 xml 파일을 이용해서 스프링이 로딩됨
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml")

public class DataSourceTest {
	
	//DataSource의 객체를  new를 사용해 따로 생성해줄 필요없이 스프링이 생성해서 주입해줌
	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception{
		try(Connection con = ds.getConnection()){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
```

```java
package com.gguri.swp;

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
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml")

public class MyBatisTest {
	
	//SqlSessionFactory 객체를 자동으로 생성
	@Inject
	private SqlSessionFactory sqlFactory;
	
	//SqlSessionFactory 객체가 제대로 만들어졌는지 Test
	@Test
	public void testFactory() {
		System.out.println(sqlFactory);
	}
	
	//MyBatis와 Mysql 서버가 제대로 연결되었는지 Test
	@Test
	public void testSession() throws Exception{
		try(SqlSession session = sqlFactory.openSession()){
			System.out.println(session);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
```

```java
//BoardDAOTest.java


package com.gguri.swp;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gguri.swp.domain.BoardVO;
import com.gguri.swp.persistence.BoardDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml")
public class BoardDAOTest {
	@Inject
	private BoardDAO boardDAO;
	
	private static final Logger logger =
		LoggerFactory.getLogger(BoardDAOTest.class);
	private static boolean didupdate = 0;
	private static int maxbno = 0;
	
	
	@Before
	public void getMaxBno() throws Exception{
		if(maxbno == 0) {
			boardDAO.create(createBoard("새로운 글을 넣음","새로운 글을 넣음"));
			maxbno=boardDAO.getMaxBno();
		}
	}
	
	@Test
	public void readTest() throws Exception {
		logger.info(boardDAO.read(maxbno).toString());
		cnt++;
	}
	
	@Test
	public void updateTest() throws Exception{
		BoardVO board = createBoard("글이 수정됨","수정테스트");
		board.setBno(maxbno);
		boardDAO.update(board);
		didupdate = true;
	}
	
	@After
	public void deleteTest() throws Exception{
		if (didupdate == true) {
			logger.info(boardDAO.listAll().toString());
			boardDAO.delete(maxbno);
			didupdate = false;
		}
	}
	
	private BoardVO createBoard(String title, String content) {
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter("user00");
		return board;
	}
}
```


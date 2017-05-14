package kr.or.dgit.my_erp;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.my_erp.util.MybatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testMyBatisSqlSessionFactory() {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		Assert.assertNotNull(sqlSession);
	}

}

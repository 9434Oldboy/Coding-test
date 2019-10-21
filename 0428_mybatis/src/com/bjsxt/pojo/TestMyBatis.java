package com.bjsxt.pojo;



import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class TestMyBatis {
	@Test
	public  void testSelAll() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
	
		/*
		 * User user = session.selectOne("com.bjsxt.mapper.UserMapper.selAll", 1);
		 * System.out.println(user); session.close();
		 */
	
		
		  List<User> list = session.selectList("com.bjsxt.mapper.UserMapper.selAll");
		  Iterator<User> it = list.iterator();
		  while(it.hasNext()) {
		  System.out.println(it.next()); 
		  }
		  session.close();
		 
		
		
	}
}
		
		 
		 
/*
 * @Test public void testUpd() { InputStream is =
 * Resources.getResourceAsStream("mybatis.xml"); SqlSessionFactory factory = new
 * SqlSessionFactoryBuilder().build(is); SqlSession session =
 * factory.openSession();
 * 
 * User user = new User(); user.setId(9); user.setUsername("´óÃû");
 * user.setPassword("abc");
 * 
 * int num = session.update("com.bjsxt.mapper.UserMapper.updUser", user); if
 * (num > 0) { System.out.println("SUCCESS"); session.commit(); } else {
 * System.out.println("FAILED"); session.rollback(); }
 * 
 * session.close(); }
 * 
 * 
 * 
 * 
 * }
 */

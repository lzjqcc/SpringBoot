package lzj.springboothib;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzj.Application;
import com.lzj.dao.UserDao;
import com.lzj.domain.Person;
import com.lzj.service.UserService;



//指定SpringBoot启动类
@SpringBootTest(classes=Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDao userDao;
	@org.junit.Test
	public void test(){
		System.out.println(userDao.findByName("li"));
	}
}

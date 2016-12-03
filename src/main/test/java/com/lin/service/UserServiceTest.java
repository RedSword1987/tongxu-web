package com.tongxuweb.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tongxuweb.baseTest.SpringTestCase;
import com.tongxuweb.domain.User;

public class UserServiceTest extends SpringTestCase	{
	@Resource
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest(){
		User user = userService.selectUserById(10);
        logger.debug("查找结果" + user);
	}
	

}

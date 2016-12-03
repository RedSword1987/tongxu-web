package com.tongxuweb.service;

import com.tongxuweb.dao.UserDao;
import com.tongxuweb.generate.Bean.TUser;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    //@Cacheable("userId")
    public TUser selectUserById(Integer userId) {
        return userDao.selectByPrimaryKey(1);

    }

    public TUser selectUserById1(Integer userId) {
        return userDao.getsss(1);
    }


}

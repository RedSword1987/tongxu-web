package com.tongxuweb.service.impl;

import com.tongxuweb.dao.UserDao;
import com.tongxuweb.generate.Bean.TUser;
import com.tongxuweb.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
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

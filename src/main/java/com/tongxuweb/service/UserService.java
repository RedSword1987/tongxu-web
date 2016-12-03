package com.tongxuweb.service;

import com.tongxuweb.domain.User;
import com.tongxuweb.generate.Bean.TUser;

public interface UserService {
    TUser selectUserById(Integer userId);

    TUser selectUserById1(Integer i);
}

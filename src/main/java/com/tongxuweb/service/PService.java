package com.tongxuweb.service;

import com.tongxuweb.domain.generate.PUser;

/**
 */
public interface PService {
    PUser getByLoginAndPass(String loginName, String password);

}

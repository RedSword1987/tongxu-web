package com.tongxuweb.service;

import com.tongxuweb.domain.generate.PUser;

/**
 * Created by higgs on 17/5/10.
 */
public interface PService {
    PUser getByLoginAndPass(String loginName, String password);

}

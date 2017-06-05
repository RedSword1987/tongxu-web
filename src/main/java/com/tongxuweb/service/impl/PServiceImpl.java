package com.tongxuweb.service.impl;

import com.tongxuweb.dao.PUserDao;
import com.tongxuweb.domain.generate.PUser;
import com.tongxuweb.domain.generate.PUserExample;
import com.tongxuweb.service.PService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 */
@Service
public class PServiceImpl implements PService {
    @Resource
    private PUserDao pUserDao;

    public PUser getByLoginAndPass(String loginName, String password) {
        PUserExample pUserExample = new PUserExample();
        pUserExample.createCriteria().andLoginNameEqualTo(loginName).andLoginPassEqualTo(password);
        List<PUser> li = pUserDao.selectByExample(pUserExample);
        if (li.size() > 0) {
            return li.get(0);
        }
        return null;
    }
}

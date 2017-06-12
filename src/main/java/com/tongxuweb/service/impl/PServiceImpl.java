package com.tongxuweb.service.impl;

import com.tongxuweb.dao.PConfigDao;
import com.tongxuweb.dao.PUserDao;
import com.tongxuweb.domain.create.PConfigAll;
import com.tongxuweb.domain.generate.PConfig;
import com.tongxuweb.domain.generate.PConfigExample;
import com.tongxuweb.domain.generate.PUser;
import com.tongxuweb.domain.generate.PUserExample;
import com.tongxuweb.service.PService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 */
@Service
public class PServiceImpl implements PService {

    @Resource
    private PConfigDao pConfigDao;

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

    @Cacheable(value = "PConfig")
    public PConfigAll getPConfig() {
        PConfigAll pConfigAll = new PConfigAll();
        PConfigExample ex = new PConfigExample();
        List<PConfig> li = pConfigDao.selectByExample(ex);
        pConfigAll.initFrom(li);

        return pConfigAll;
    }

    //, beforeInvocation = true, allEntries = true
    @CacheEvict(value = "PConfig", allEntries = true, beforeInvocation = true)
    public PConfigAll updatePConfig(PConfigAll pConfigAll) {
        if (pConfigAll != null) {
            pConfigDao.updateByKey("WuliuBaozhuang", pConfigAll.getWuliuBaozhuang());
            pConfigDao.updateByKey("WuliuChangku", pConfigAll.getWuliuChangku());
            pConfigDao.updateByKey("WuliuKuaidi", pConfigAll.getWuliuKuaidi());
            pConfigDao.updateByKey("WuliuYunfeixian", pConfigAll.getWuliuYunfeixian());
            pConfigDao.updateByKey("YunyinFuwufei", pConfigAll.getYunyinFuwufei());
            pConfigDao.updateByKey("YunyinKoudian", pConfigAll.getYunyinKoudian());
            pConfigDao.updateByKey("YunyinTeshu", pConfigAll.getYunyinTeshu());
            pConfigDao.updateByKey("YunyinYongjin", pConfigAll.getYunyinYongjin());
            pConfigDao.updateByKey("yunyinYouhuiquan", pConfigAll.getYunyinYouhuiquan());

        }
        return pConfigAll;
    }

}

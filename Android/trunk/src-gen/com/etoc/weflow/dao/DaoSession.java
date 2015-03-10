package com.etoc.weflow.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.etoc.weflow.dao.FrequentPhone;
import com.etoc.weflow.dao.FrequentQQ;

import com.etoc.weflow.dao.FrequentPhoneDao;
import com.etoc.weflow.dao.FrequentQQDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig frequentPhoneDaoConfig;
    private final DaoConfig frequentQQDaoConfig;

    private final FrequentPhoneDao frequentPhoneDao;
    private final FrequentQQDao frequentQQDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        frequentPhoneDaoConfig = daoConfigMap.get(FrequentPhoneDao.class).clone();
        frequentPhoneDaoConfig.initIdentityScope(type);

        frequentQQDaoConfig = daoConfigMap.get(FrequentQQDao.class).clone();
        frequentQQDaoConfig.initIdentityScope(type);

        frequentPhoneDao = new FrequentPhoneDao(frequentPhoneDaoConfig, this);
        frequentQQDao = new FrequentQQDao(frequentQQDaoConfig, this);

        registerDao(FrequentPhone.class, frequentPhoneDao);
        registerDao(FrequentQQ.class, frequentQQDao);
    }
    
    public void clear() {
        frequentPhoneDaoConfig.getIdentityScope().clear();
        frequentQQDaoConfig.getIdentityScope().clear();
    }

    public FrequentPhoneDao getFrequentPhoneDao() {
        return frequentPhoneDao;
    }

    public FrequentQQDao getFrequentQQDao() {
        return frequentQQDao;
    }

}

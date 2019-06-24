package com.example.greeeddaodem.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.greeeddaodem.StudentBean;

import com.example.greeeddaodem.dao.StudentBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig studentBeanDaoConfig;

    private final StudentBeanDao studentBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        studentBeanDaoConfig = daoConfigMap.get(StudentBeanDao.class).clone();
        studentBeanDaoConfig.initIdentityScope(type);

        studentBeanDao = new StudentBeanDao(studentBeanDaoConfig, this);

        registerDao(StudentBean.class, studentBeanDao);
    }
    
    public void clear() {
        studentBeanDaoConfig.clearIdentityScope();
    }

    public StudentBeanDao getStudentBeanDao() {
        return studentBeanDao;
    }

}

package com.learn.framework.service.impl;

import com.learn.framework.bean.User;
import com.learn.framework.dao.IUserDao;
import com.learn.framework.service.IUserService;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class UserServiceImpl implements IUserService {

     private IUserDao userDao;

    public void saveUser(User u) {
       this.userDao.saveUser(u);
    }
}

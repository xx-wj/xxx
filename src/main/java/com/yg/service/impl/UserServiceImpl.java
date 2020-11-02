package com.yg.service.impl;

import com.yg.dao.UserDao;
import com.yg.pojo.User;
import com.yg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int registerUser(User user) {

        user.setRole(2);
        Date nowDate=new Date();
        user.setRegtime(nowDate);
        user.setUpdatetime(nowDate);
        user.setUserstatus(1);
        int result=userDao.insertUser(user);
        return result;
    }
}

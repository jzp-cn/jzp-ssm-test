package com.jzp.manager.service.impl;


import com.jzp.manager.mapper.UserDao;
import com.jzp.manager.pojo.User;
import com.jzp.manager.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
    
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }
    
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

/*
    public static void main(String[] args) {
        List a =new ArrayList();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        List list = a.subList(1, 4);
        System.out.println(list);
    }*/
}

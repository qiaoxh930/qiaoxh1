package com.a.service;

import com.a.dao.UserDao;
import com.a.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

/**
 * @ClassName UserServiceImpl
 * @Author qiaoxh
 * @Date 2020/9/12 17:04
 * @Description TOOO
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private HttpSession session;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public void queryOne(User user) {
        User user1 = userDao.queryUsername(user.getUsername());
        if(user1==null){
            throw new RuntimeException("用户名错误");
        }
        if(!user.getPassword().equals(user1.getPassword())){
            throw new RuntimeException("密码错误");
        }
        session.setAttribute("user",user1);
    }
}

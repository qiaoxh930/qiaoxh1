package com.a.service;

import com.a.dao.JssuesDao;
import com.a.entity.Jssues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName JssuesServiceImpl
 * @Author qiaoxh
 * @Date 2020/9/13 15:47
 * @Description TOOO
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class JssuesServiceImpl implements JssuesService{
    @Autowired
    private JssuesDao jssuesDao;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Jssues queryOne() {
        return jssuesDao.queryOne();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Jssues queryId(Integer id) {
        return jssuesDao.queryId(id);
    }


    @Override
    public void updateLike(Integer id) {
        Jssues jssues1 = jssuesDao.queryId(id);
        jssues1.setLikes(jssues1.getLikes()+1);
        jssuesDao.updateLike(jssues1);
    }

    @Override
    public List<Jssues> queryJssues(String jssues) {
        return jssuesDao.queryJssues(jssues);
    }
}

package com.a.service;

import com.a.dao.CommentDao;
import com.a.dao.JssuesDao;
import com.a.entity.Comment;
import com.a.entity.Jssues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName CommentServiceImpl
 * @Author qiaoxh
 * @Date 2020/9/13 16:54
 * @Description TOOO
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentDao commentDao;
    @Autowired
    private JssuesDao jssuesDao;
    @Override
    public void updateLikes(Integer id) {
        Comment comment = commentDao.queryId(id);
        comment.setLikes(comment.getLikes()+1);
        commentDao.updateLikes(comment);
    }

    @Override
    public void insertComment(Comment comment) {
        Jssues jssues = jssuesDao.queryId(comment.getJssuesId());
        jssues.setCommentNumber(jssues.getCommentNumber()+1);
        System.out.println(comment+"*****"+jssues);
        commentDao.insertComment(comment);
        jssuesDao.updateLike(jssues);
        System.out.println("****************************");
    }
}

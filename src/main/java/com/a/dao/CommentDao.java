package com.a.dao;

import com.a.entity.Comment;

/**
 * @ClassName CommentDao
 * @Author qiaoxh
 * @Date 2020/9/13 16:48
 * @Description TOOO
 */
public interface CommentDao {
    Comment queryId(Integer id);
    void updateLikes(Comment comment);
    void insertComment(Comment comment);
}

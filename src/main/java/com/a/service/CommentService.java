package com.a.service;

import com.a.entity.Comment;

public interface CommentService {
    void updateLikes(Integer id);
    void insertComment(Comment comment);
}

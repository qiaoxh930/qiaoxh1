package com.a.dao;

import com.a.entity.Jssues;

import java.util.List;

public interface JssuesDao {
    Jssues queryId(Integer id);
    Jssues queryOne();
    void updateLike(Jssues jssues);
    List<Jssues> queryJssues(String jssues);
}

package com.a.service;

import com.a.entity.Jssues;

import java.util.List;

public interface JssuesService {
    Jssues queryOne();
    Jssues queryId(Integer id);
    void updateLike(Integer id);
    List<Jssues> queryJssues(String jssues);
}

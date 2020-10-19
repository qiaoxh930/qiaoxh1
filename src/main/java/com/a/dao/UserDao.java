package com.a.dao;

import com.a.entity.User;

public interface UserDao {
    User queryUsername(String username);
}

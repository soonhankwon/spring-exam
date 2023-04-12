package com.soon.springexam.dao;

import com.soon.springexam.domain.SConnectionMaker;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new SConnectionMaker();
        return new UserDao(connectionMaker);
    }
}

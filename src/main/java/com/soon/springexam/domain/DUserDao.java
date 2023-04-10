package com.soon.springexam.domain;

import com.soon.springexam.dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDao {
    @Override
    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.mariadb-java-client");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/spring-exam-db","root","");
    }
}

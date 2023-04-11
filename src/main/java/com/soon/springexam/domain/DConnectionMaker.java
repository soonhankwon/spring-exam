package com.soon.springexam.domain;

import com.soon.springexam.dao.ConnectionMaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.mariadb-java-client");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/spring-exam-db","root","");
    }
}

package com.soon.springexam.domain;

import com.soon.springexam.dao.ConnectionMaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//변화가 불필요하게 일어나지 않도록 닫혀있음 (interface 의 구체적인 구현)
public class SConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/spring-exam-db","root","");
    }
}

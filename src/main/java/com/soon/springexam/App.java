package com.soon.springexam;

import com.soon.springexam.dao.ConnectionMaker;
import com.soon.springexam.dao.UserDao;
import com.soon.springexam.domain.SConnectionMaker;
import com.soon.springexam.domain.User;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Runtime 시 구체적인 구현을 한 SConnectionMaker 와의 관계설정 책임
        ConnectionMaker connectionMaker = new SConnectionMaker();
        UserDao dao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("soon");
        user.setName("soonhan");
        user.setPassword("1234");

        dao.add(user);

        System.out.println(user.getId() + " 등록성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회성공");
    }
}

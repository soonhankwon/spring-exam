package com.soon.springexam;

import com.soon.springexam.domain.SUserDao;
import com.soon.springexam.domain.User;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SUserDao dao = new SUserDao();

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

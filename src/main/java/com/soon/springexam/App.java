package com.soon.springexam;

import com.soon.springexam.dao.DaoFactory;
import com.soon.springexam.dao.UserDao;
import com.soon.springexam.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        //어플리케이션 컨텍스트가 관리하는 오브젝트를 요청하는 메서드

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

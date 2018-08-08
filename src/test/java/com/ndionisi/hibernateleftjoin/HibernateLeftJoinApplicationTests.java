package com.ndionisi.hibernateleftjoin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManagerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateLeftJoinApplicationTests {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Test
    public void readCustomer() {
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
        Session session = sessionFactory.openSession();
        session.createQuery("SELECT c.id from Customer c").list();
        session.close();
    }

}

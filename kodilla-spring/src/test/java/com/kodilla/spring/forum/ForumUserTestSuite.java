package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootTest(classes=ForumUser.class)
public class ForumUserTestSuite {

    @Test
    public void testGetUserName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser user = context.getBean(ForumUser.class);

        //When
        String name = user.getName();

        //Then
        Assert.assertEquals("John Smith", name);
    }

}

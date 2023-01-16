package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = BoardTestSuite.class)
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("task1");
        board.getInProgressList().addTask("task2");
        board.getDoneList().addTask("task3");

        //Then
        Assertions.assertEquals("task1",board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("task2", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("task3", board.getDoneList().getTasks().get(0));

    }
}

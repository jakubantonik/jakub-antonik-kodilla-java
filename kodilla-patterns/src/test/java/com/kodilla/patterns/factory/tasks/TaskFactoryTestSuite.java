package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);

        //Then
        Assertions.assertEquals("Fruit", shoppingTask.getTaskName());
        System.out.println(shoppingTask.getTaskName());
    }
    @Test
    void testPaintingTask(){
        //given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);

        //Then
        Assertions.assertEquals("Garden", paintingTask.getTaskName());
        System.out.println(paintingTask.getTaskName());
    }
    @Test
    void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);

        //Then
        Assertions.assertEquals("Travel", drivingTask.getTaskName());
        System.out.println(drivingTask.getTaskName());
    }
}

package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TaskQueueTestSuite {

    @Test
    public void testUpdate(){
        //Given
        TaskQueue taskQueue1 = new TaskQueue("task1");
        TaskQueue taskQueue2 = new TaskQueue("task2");
        TaskQueue taskQueue3 = new TaskQueue("task3");
        TaskQueue taskQueue4 = new TaskQueue("task4");
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");
        Mentor mentor3 = new Mentor("Mentor3");
        taskQueue1.registerObserver(mentor1);
        taskQueue1.registerObserver(mentor2);
        taskQueue2.registerObserver(mentor1);
        taskQueue2.registerObserver(mentor2);
        taskQueue2.registerObserver(mentor3);
        taskQueue3.registerObserver(mentor1);
        taskQueue3.registerObserver(mentor2);
        taskQueue3.registerObserver(mentor3);
        taskQueue4.registerObserver(mentor2);
        //When
        taskQueue2.addTask("Test task1");
        taskQueue1.addTask("Test task2");
        taskQueue2.addTask("Test task3");
        taskQueue3.addTask("Test task4");
        taskQueue3.addTask("Test task5");
        taskQueue4.addTask("Test task6");
        taskQueue4.addTask("Test task7");
        taskQueue1.addTask("Test task8");
        //Then
        Assertions.assertEquals(6, mentor1.getUpdateCount());
        Assertions.assertEquals(8, mentor2.getUpdateCount());
        Assertions.assertEquals(4, mentor3.getUpdateCount());
    }
}

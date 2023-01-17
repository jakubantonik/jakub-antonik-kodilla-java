package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void TestGetLastLog(){
        //Given
        Logger.getInstance().log("Hi");

        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assertions.assertEquals("Hi", result);
    }
}

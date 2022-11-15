package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //When
        double averageExpected = 10.5;
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(averageExpected, average);
        System.out.println(average);
    }
}

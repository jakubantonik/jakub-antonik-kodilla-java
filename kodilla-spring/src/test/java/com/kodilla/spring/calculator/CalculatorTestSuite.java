package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes= CalculatorTestSuite.class)
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result1 = calculator.add(5,10);
        double result2 = calculator.sub(5,10);
        double result3 = calculator.mul(5,10);
        double result4 = calculator.div(5,10);

        //Then
        Assertions.assertEquals(15, result1);
        Assertions.assertEquals(5, result2);
        Assertions.assertEquals(50, result3);
        Assertions.assertEquals(2, result4);

    }
}

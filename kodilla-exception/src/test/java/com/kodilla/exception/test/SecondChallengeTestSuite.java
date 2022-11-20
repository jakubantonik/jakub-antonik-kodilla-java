package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.testng.Assert.assertThrows;

public class SecondChallengeTestSuite {
    @Test
    void probablyWillThrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1,1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 2))
                );


    }
}

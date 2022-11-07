package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.when;


public class CountingStatisticsTest {

    @Mock
    private Statistics statisticsMock;
    CountingStatistics countingStatistics = new CountingStatistics();

    @BeforeEach
    public void before(){
        System.out.println("Test Case:begin");
    }

    @Test
    public void testCalculateAdvStatisticsWith0Posts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, countingStatistics.getNumberOfPosts());

    }
    @Test
    public void testCalculateAdvStatisticsWith1000Posts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1000, countingStatistics.getNumberOfPosts());

    }
    @Test
    public void testCaluclateAdvStatisticsWith0Comments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,countingStatistics.getNumberOfComments());

    }
    @Test
    public void testCalculateAdvStatisticsWithLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(6);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, countingStatistics.getNumberOfComments());
        Assertions.assertEquals(6, countingStatistics.getNumberOfPosts());

    }
    @Test
    public void testCalculateAdvStatisticsWithMoreCommentsThanPosts(){
        //Given

        //When

        //Then

    }
    @Test
    public void testCalculateAdvStatisticsWith0Users(){
        //Given

        //When

        //Then

    }
    @Test
    public void testCalculateAdvStatisticsWith100Users(){
        //Given

        //When

        //Then
    }
}

package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
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
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(5, countingStatistics.getNumberOfComments());
        Assertions.assertEquals(10, countingStatistics.getNumberOfPosts());
        Assertions.assertEquals(0.5, countingStatistics.getAverageOfCommentsPerPost(), 0.01);

    }
    @Test
    public void testCalculateAdvStatisticsWithMoreCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(6);
        when(statisticsMock.postsCount()).thenReturn(2);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(6,countingStatistics.getNumberOfComments());
        Assertions.assertEquals(2,countingStatistics.getNumberOfPosts());
        Assertions.assertEquals(3, countingStatistics.getAverageOfCommentsPerPost());

    }
    @Test
    public void testCalculateAdvStatisticsWith0Users(){
        //Given
        List<String>list= new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(list);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,countingStatistics.getNumberOfUsers());

    }
    @Test
    public void testCalculateAdvStatisticsWith100Users(){
        //Given
        List<String>list = new ArrayList<>();
        for(int i=0; i<100; i++){
            list.add("user");
        }
        when(statisticsMock.usersNames()).thenReturn(list);

        //When
        countingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100,countingStatistics.getNumberOfUsers());
    }
}

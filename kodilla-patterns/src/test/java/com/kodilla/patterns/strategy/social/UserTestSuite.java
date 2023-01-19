package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User ania = new Millenials("Ania");
        User kamil = new YGeneration("Kamil");
        User damian = new ZGeneration("Damian");

        //When
        String post1 = ania.sharePost();
        String post2 = kamil.sharePost();
        String post3 = damian.sharePost();

        //Then
        Assertions.assertEquals("Tweet shared", post1);
        Assertions.assertEquals("Post shared", post2);
        Assertions.assertEquals("Snap shared", post3);
        System.out.println(post1 + " " +  post2 + " " + post3);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User ania = new Millenials("Ania");

        //When
        String post4 = ania.sharePost();
        System.out.println(post4);
        ania.setSocialPublisher(new SnapchatPublisher());
        post4 = ania.sharePost();
        System.out.println(post4);

        //Then
        Assertions.assertEquals("Snap shared", post4);
    }
}

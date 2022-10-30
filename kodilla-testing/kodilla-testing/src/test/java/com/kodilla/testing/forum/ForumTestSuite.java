package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case:begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test suite: begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Test suite: end");
    }

    @DisplayName(
            "When create SimpleUser with realName, " +
                    "then getRealname should return real name user"
    )
    @Test
    void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals("John Smith", result);
    }
    @DisplayName(
            "When create SimpleUser with realName, " +
                    "then getRealname should return real name user"
    )
    @Test
    void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String expectedResult = "theForumUser";

        //When
        String result = simpleUser.getUsername();

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

}

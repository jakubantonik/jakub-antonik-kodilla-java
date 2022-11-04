package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Rozpoczęcie testu");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Zakończenie testu");
    }



    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();


    @DisplayName("Testowanie, czy klasa zachowuje się poprawnie, gdy jest pusta")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer>emptyList = new ArrayList<>();

        //When
        List<Integer> resultlist = new ArrayList<>(oddNumbersExterminator.exterminate(emptyList));

        //Then
        Assertions.assertEquals(emptyList, resultlist);

    }
    @DisplayName("Testowanie, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(10);

        //When
        List<Integer> resultList1 = new ArrayList<>(oddNumbersExterminator.exterminate(normalList));

        //Then
        Assertions.assertEquals(expectedList, resultList1);

    }
}

package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Book book1 = new Book ("Author1", "Title1", 2010,"123");
        Book book2 = new Book ("Author2", "Title2", 2011,"234");
        Book book3 = new Book ("Author3", "Title3", 2012,"345");
        Book book4 = new Book ("Author4", "Title4", 2013,"456");
        Book book5 = new Book ("Author5", "Title5", 2015,"567");
        HashSet<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2012, median);
    }
}

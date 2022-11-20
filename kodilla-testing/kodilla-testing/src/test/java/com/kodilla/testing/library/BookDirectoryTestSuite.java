package com.kodilla.testing.library;

import net.bytebuddy.NamingStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "xyz", 2005);
        Book book3 = new Book("Secret life of programmers", "Steve xyz", 2007);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondidtion("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for (int n=1; n<=booksQuantity; n++){
            Book theBook = new Book("Title " +n, "Author " + n, 1970 +n );
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    void testListBooksWithConditionMoreThan20(){
       //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondidtion("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondidtion("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondidtion("FortyBooks");

        //Then
        assertEquals(0,theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }
    @Test
    void testListBooksWithConditionFragmentShorterThan3(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondidtion("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    void testListBooksInHandsOf0Books(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Maciek", "Nowak", "001");
        List<Book> listWith0Books = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith0Books);

        //When
        List<Book> theListOf0Books = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assertions.assertEquals(0,theListOf0Books.size());

         }
    @Test
    void testListBooksInHandsOf1Book(){
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Franek", "Nowak", "002");
        List<Book> listWith1Books = new ArrayList<Book>();
        Book book1 = new Book("title", "author", 2022);
        listWith1Books.add(book1);


        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith1Books);

        //When
        List<Book> theListOf1Books = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assertions.assertEquals(1,theListOf1Books.size());
    }
    @Test
    void testListBooksInHandsOf5Books(){
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Franek", "Nowak", "002");
        List<Book> listWith5Books = new ArrayList<Book>();
        Book book1 = new Book("title", "author", 2022);
        Book book2 = new Book("title", "author", 2021);
        Book book3 = new Book("title", "author", 2020);
        Book book4 = new Book("title", "author", 2019);
        Book book5 = new Book("title", "author", 2018);
        listWith5Books.add(book1);
        listWith5Books.add(book2);
        listWith5Books.add(book3);
        listWith5Books.add(book4);
        listWith5Books.add(book5);


        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith5Books);

        //When
        List<Book> theListOf5Books = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assertions.assertEquals(5,theListOf5Books.size());
    }

}

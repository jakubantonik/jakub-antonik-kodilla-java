package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Biblioteka1");
        Book book1 = new Book("Książka1", "Autor1", LocalDate.of(2000,4,12));
        Book book2 = new Book("Książka2", "Autor2", LocalDate.of(1999,1,18));
        Book book3 = new Book("Książka3", "Autor3", LocalDate.of(1995,10,1));
        Book book4 = new Book("Książka4", "Autor4", LocalDate.of(2000,6,22));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Bilblioteka3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }


        //When
        library.getBooks().remove(book4);

        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        Assertions.assertEquals(3,library.getBooks().size());
        Assertions.assertEquals(3,clonedLibrary.getBooks().size());
        Assertions.assertEquals(4, deepClonedLibrary.getBooks().size());

    }
}

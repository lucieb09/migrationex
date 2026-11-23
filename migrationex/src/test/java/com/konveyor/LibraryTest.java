package com.konveyor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LibraryTest {
    @Test
    public void findsBooksByTitle() {
        Library library = new Library();

        assertTrue(library.findBookByTitle("Effective Java").isPresent());
        assertFalse(library.findBookByTitle("Unknown book").isPresent());
    }

    @Test
    public void addsAndRemovesBooksByTitle() {
        Library library = new Library();
        Book book = new Book("Modern Java", "Jane Doe");

        library.addBook(book);
        assertTrue(library.findBookByTitle("Modern Java").isPresent());

        library.removeBook(book);
        assertFalse(library.findBookByTitle("Modern Java").isPresent());
    }
}
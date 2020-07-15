import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Borrower borrower;

    @Before
    public void setUp() {
        library = new Library(2);
        book = new Book("a","Greg","Horror");
        book1 = new Book("Dragon","George","Fantasy");
        book2 = new Book("b","Greg","Horror");
//        borrower = new Borrower("Dave");
//        borrower.addBook(Book);
    }

    @Test
    public void BookCountStartsAt0() {
        Integer target = 0;
        assertEquals(target, library.getBookCount());
    }

    @Test
    public void canaddBook() {
        library.addBook(book);
        Integer target = 1;
        assertEquals(target, library.getBookCount());
    }

    @Test
    public void cantaddBook() {
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        Integer target = 2;
        assertEquals(target, library.getBookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook(book);
        assertFalse(library.getBooks().contains(book));
        Integer target = 0;
        assertEquals(target, library.getBookCount());
    }



}
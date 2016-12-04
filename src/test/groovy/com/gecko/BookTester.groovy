package com.gecko

import com.gecko.type.Book
import org.junit.Test

/**
 * Created by hlieu on 11/20/16.
 */
class BookTester {

    @Test
    public void testBookConstructor() {
        Book book = new Book("Something Strange This Way Comes", 4322);
        assert book.title == "Something Strange This Way Comes";
    }

    @Test
    public void testBookSwitch() {
        // this tests the book object inside a switch statement
        // possible only because of isCase method.

        Book book = new Book("Something In The Neighborhood", 1111);
        Book other = new Book("Random Title", 1111);
        switch (book) {
            case 0: println "not the same book";
                break;
            case 2: println "other book";
                break;
            case 1111: println "found as an int";
                break;
            case other: println book.title + " was found";
                break;
            default : println "Book was not found";
                break;
        }


    }
}

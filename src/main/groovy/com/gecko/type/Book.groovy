package com.gecko.type

/**
 * Created by hlieu on 11/14/16.
 */
class Book {
    private String title;
    private int isdn;

    Book(String title, int isdn) {
        this.title = title;
        this.isdn = isdn;
    }

    // implementing isCase allows us to use book instance
    // in a switch statements. See BookTester.groovy
    public boolean isCase(Book candidate) {
        return this.isdn == candidate.isdn;
    }

    /* public boolean isCase(int isdn) {
        return this.isdn == isdn;
    } */
}

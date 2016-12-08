package com.gecko;

import com.gecko.type.Address;

/**
 * Created by hlieu on 11/19/16.
 *
 * This class does two things:
 *  1. shows that you can call/instantiate a pojo from a pogo, &
 *  2. show that you can call/instantiate a pogo from a pojo
 */
public class TestClass {

    public TestClass() {
    }

    /*
     * You can call a groovy class from a java class.
     * This example method creates an object this is written
     * in Groovy, but it is seamless to the compiler
     * and the JVM.
     */
    public Address createGroovyObject() {

        // Address is a POGO - a groovy object
        Address address = new Address ();
        address.setLine1("Some line");
        address.setLine2("Another line");
        address.setCity("Some City");
        address.setZipCode ("754731");
        address.setCountry("USA");
        return address;
    }

    public void intTest() {
        System.out.println("do nothing");
    }

    /**
     * This method is called by a Groovy test object, TestClassTester
     * @param args
     */
    public static void main (String[] args) {

        System.out.println("Welcome to Groovy");
        TestClass c = new TestClass();
        Address a = c.createGroovyObject ();
        System.out.println( a.getLine1() );
    }
}

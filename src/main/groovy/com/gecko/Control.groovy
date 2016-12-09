package com.gecko

/**
 * Created by hlieu on 11/20/16.
 */

// this is an example of how groovy uses the
// empty datastructure as a control
// for loop control
public void listAssertions() {

    // an empty list evaluates to false
    List t = [];
    assert !t;

    // a non-empty list is true
    t = [1];
    assert t;

    // note that you need to use t directly as a boolean,
    // not as a comparison to a boolean
    // both the next 2 statements will fail even though
    // it passed above
    try {
        assert t == true;
    } catch (AssertionError e) {
        println "caught a failed assertion";
        //e.printStackTrace();
    }

    try {
        assert t == false;
    } catch (AssertionError e) {
        println "caught a failed assertion"
        //e.printStackTrace();
    }
}

public void mapAssertions() {

    // an empty map is false as a control, but not as a boolean
    Map m = [:];
    assert !m;

    // a non-empty map is true as a control, but not as a boolean
    Map m2 = [a_key:"a_value"];
    assert m2;

    try {
        assert m == false;
    } catch (AssertionError e) {
        println "Caught a failed map assertion";
    }

    try {
        assert m2 == true;
    } catch (AssertionError e) {
        println "Caught a failed map assertion"
    }
}

public void stringAssertions() {

    // a non-empty string is true as a control, not as a boolean
    String s = 'a';
    assert s;

    assert !'';

    try {
        assert s == true;
    } catch (AssertionError a) {
        println "caught a string assertion failure, s == true";
    }

    try {
        assert s == false;
    } catch (AssertionError a) {
        println "caught a string assertion failure, s == false";
    }

}

public void numberAssertions () {
    int i = 1;

    assert i;

    int j = 0;
    assert !j;


}

listAssertions();
mapAssertions();
stringAssertions();
numberAssertions();
package com.gecko

/**
 * Created by hlieu on 11/20/16.
 */

public void listAssertions() {
    List t = [];
    assert !t;

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
    Map m = [:];
    assert !m;

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
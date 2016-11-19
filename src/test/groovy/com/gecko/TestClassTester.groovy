package com.gecko

import org.junit.Test

/**
 * Created by hlieu on 11/19/16.
 */
class TestClassTester {

    @Test
    public void doSomething(){
        TestClass tester = new TestClass();
        tester.intTest();
    }

    @Test
    public void testMain() {
        TestClass.main(null);
    }
}

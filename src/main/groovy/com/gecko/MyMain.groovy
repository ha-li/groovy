package com.gecko

import com.gecko.type.MyGroovyBean

/**
 * Created by hlieu on 11/22/16.
 */

// this is a test class my MyGroovyBean which has 2 private members
// and private methods, but we are still able to access the private
// members and methods, so Groovy does not respect your privacy.
class MyMain {


    public static void main(String[] args) {
        MyGroovyBean bean = new MyGroovyBean();
        bean.setId("Is this allowed?");
        assert 'getId is private' == bean.getId();
        bean.id = "Will this still work?"
        assert 'getId is private' == bean.getId();

        bean.setMoney(100);
        assert bean.money == 1000;   // get back 10 times our money via the gettinger
        assert bean.@money == 100;   // but direct access returns us the value of money
    }
}

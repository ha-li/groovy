package com.gecko.type

/**
 * Created by hlieu on 11/22/16.
 */
class MyGroovyBean {
    // this property is private so you shouldn't be able to
    // access it outside of this class, but we do so in the
    // main method
    private String name;

    // GroovyBeans will implicitly create a getter
    // and setter for you so that you can use
    // the bean like a normal Java Bean

    // this id is private and i've overridden it's
    // getters and setters and made them private.
    // but in class MyGroovyBeanUser.groovy (which is at a different package level)
    // we can still get the private methods and access the private
    // member, so Groovy does not respect your privacy -- weird coming
    // from a java world
    private String id;
    public String getId() {
        return "getId is private";
    }

    public void setId (String id) {
        println "setting id to " + id;
        this.id = id;
    }

    private int money;
    public void setMoney (int m) {
        this.money = m;
    }

    public int getMoney () {
        // note that this access money was actually getMoney()
        // it would lead to an endless recursion

        // inside the 'lexical scope' of a field, the member
        // is directly accessed. You can achieve this
        // outside of the 'lexical scope' by using
        // reference.@fieldname notation (see MyGroovyBeanUser.groovy)
        return 10 * money;   // return 10 times your money
    }
}

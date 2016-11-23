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
    // but in class MyMain.groovy (which is at a different package level)
    // we can still get the private methods and access the private
    // member, so Groovy does not respect your privacy -- weird coming
    // from a java world
    private String id;
    private String getId() {
        return "getId is private";
    }

    private void setId (String id) {
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
        // reference.@fieldname notation (see MyMain.groovy)
        return 10 * money;   // return 10 times your money
    }


    public static void main (String[] args) {
        MyGroovyBean bean = new MyGroovyBean();

        // it seems like we are directly accessing
        // a private member of MyGroovyBean,
        // but we are actually calling bean.setName ('Jimbolaya');
        bean.name = "Jimbolaya";

        // and here we are calling bean.getName();
        assert bean.name == 'Jimbolaya';

        //
        bean.setId( "I am an id" );
        assert bean.id == "getId is private";
    }
}
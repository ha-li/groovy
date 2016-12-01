package com.gecko.type

/**
 * Created by hlieu on 11/30/16.
 */
class MainGroovy {

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

        bean.id = "Am I going through the setter method";
        println "bean id = " + bean.id
    }
}


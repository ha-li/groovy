package com.gecko

/**
 * Created by hlieu on 11/21/16.
 */

// groovy allows you to define multiple classes
// within the same file. The compiler will
// compile each class definition into separate
// .class file. You can use them like any other
// class, and you can call them like an application
// if they define a main method

class MultiClass {
    String id;
    String place;
}

class AaClass {
    String aName;

    public static void main (String[] args) {
        AaClass aClass = new AaClass();
        aClass.aName = "BooYa"
        System.out.println aClass.aName;
    }
}

class AbClass {
    int age;
}

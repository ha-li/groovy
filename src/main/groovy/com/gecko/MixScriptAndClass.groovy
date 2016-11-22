package com.gecko

/**
 * Created by hlieu on 11/21/16.
 */

// this file contains both a class and a script.
// the class CANNOT have the same name as the file
// the compiler will compile this into 2 class files,
// 1. AndClass.class
// 2. MixScriptAndClass.class (which will extend Script object)
class AndClass {
    int age;
    String id;
}

int i = 5;
AndClass aClass = new AndClass(age: i);
assert aClass.age == i;


package com.gecko.objects

/**
 * Created by hlieu on 12/9/16.
 *
 * In Groovy, everything is an object, including primitives.
 * However, Groovy will allow you to use primitives for
 * things like int, double etc, however, groovy compiler
 * will automatically wrap these primitives into their
 * corresponding objects in the bytecode.
 *
 */
class Objects {


    public static void main (String[] args) {
       // if you do not declare the type, then
       // it is implicitly a type of java.lang.Object
       def k = 5;
       assert k instanceof Object;
       assert k instanceof Integer;
    }
}


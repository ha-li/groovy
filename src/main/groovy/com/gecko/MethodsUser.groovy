package com.gecko

/**
 * Created by hlieu on 11/20/16.
 */
class MethodsUser {

    def aMethod() {
        return "By default, methods are public";
    }

    def bMethod(argWithOptionalType) {
        return argWithOptionalType + 1;
    }

    def cMethod(typeUnknown, String knownType) {
        return knownType + " " + typeUnknown;
    }

    def dMethod(whatType) {
        return whatType.getClass();
    }

    static main (args) {
        println "This is public static void main (String[] args) method";

        MethodsUser user = new MethodsUser();
        println "calling a method with no return type and no declared accessor is okay because, ";
        println user.aMethod();

        println "\n\nparameters to methods also have optional types";
        println user.bMethod(3);

        println "\n\nyou can also have methods with a mix of typed and untyped parameters";
        println user.cMethod(2, "Passing an int and a string");
        print user.cMethod("just as easily passed 2 strings", "But you could have ");

        println "\n\nnext we need to figure out what the default type is";
        println "untyped parameters are of type: " + user.dMethod("") + " or is it? " + user.dMethod(1);
    }
}

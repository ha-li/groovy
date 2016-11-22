package com.gecko

/**
 * Created by hlieu on 11/21/16.
 */
class ConstructorUser {
    String name;
    String id;

    /* public ConstructorUser(String name, String id) {
       this.name = name;
        this.id = id;
    } */

    public static void main(String[] args) {

        // we can use named parameters only if the constructor for
        // the class was not defined. as soon as we define a
        // constructor this type of instantiation is not allowed
        ConstructorUser user = new ConstructorUser(name: 'BuilderBob');
        assert user.name == 'BuilderBob';

        ConstructorUser user2 = new ConstructorUser(id: "12321", name: "KillJoys");
        assert user2.id == '12321';
        assert user2.name == 'KillJoys';
    }

}





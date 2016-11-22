package com.gecko

import com.gecko.type.Modulo

/**
 * Created by ha-li on 11/17/16.
 * An example groovy script using the Modulo class
 * and operator overloading
 */

// since it doesn't have a class definition, this is a
// groovy script
//
// the groovy compiler will do the following:
// 1. turn this into a class with the same name as the file name
// 2. make the class extend Script object
// 3. enclose the contents of the script in a public Object run () method
// 4. add a main method
// 5. and some other more sophisticated stuff with Caller etc.
//
// see the compiled class for verification

// test 1, Modulo + Modolu
Modulo five_eiight = new Modulo(5, 8);
Modulo six_eight = new Modulo(6, 8);
Modulo my = five_eiight + six_eight;
System.out.println(my);

// test 2, Modulo + Integer
Modulo one_eight = new Modulo(1, 8);
Modulo not_sure = one_eight + 3;
System.out.println(not_sure);

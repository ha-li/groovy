package com.gecko.closures

/**
 * Created by hlieu on 12/11/16.
 *
 * Currying is named after Haskell Curry, is the functional
 * programming technique of transforming a function that
 * takes two parameters into a 1 parameter function by
 * fixing one of the values
 */
def mult = {
   x, y -> x * y
}

def mult_by_3 = {
   x ->
   mult (x, 3);
}

assert 12 == mult_by_3 (4);

// we can curry using the Closure.curry method !
def mult_by_7 = mult.curry (7);
assert mult_by_7 (3) == 21;
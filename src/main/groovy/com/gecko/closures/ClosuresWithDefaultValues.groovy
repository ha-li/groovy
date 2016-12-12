package com.gecko.closures

/**
 * Created by hlieu on 12/11/16.
 */

// this closure has a default value
def add = {
   x, y = 6 ->
      return x + y;
}

// when we pass in a value, the default is overridden
assert add (1, 2) == 3;

// make use of the default value
assert add (9) == 15
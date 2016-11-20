package com.gecko

import java.lang.reflect.Array

/**
 * Created by hlieu on 11/19/16.
 */
// groovy lists are created using the square brackets
List myList = [1, 2, 3, 4];
//assert(myList.length() == 4);
assert(myList.size == 4);

// with lists, you can do have negative values as array index,
// starting with the last value at -1,
// 2nd last value at -2, so on ...
assert myList[-1] == 4;
assert myList[-2] == 3;
assert myList[-3] == 2;
assert myList[-4] == 1;


try {
    assert myList[-5] == 0;
} catch (ArrayIndexOutOfBoundsException ae) {
    assert ae instanceof ArrayIndexOutOfBoundsException;
    ae.printStackTrace();
}
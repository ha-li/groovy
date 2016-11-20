package com.gecko

/**
 * Created by hlieu on 11/19/16.
 */

def myMap = [a:1, b:2, c:3];
assert myMap['b'] == 2;
assert myMap['a'] == 1;


def myMap1 = [asb:'then', kdkf:'how'];
assert myMap1['asb'] == 'then';
assert myMap1['kdkf'] == 'how';

def toStr = '';
// 'each' takes a closure with paramater of map.entry
myMap1.each { entry ->
    toStr += entry.key + ' '
}

println toStr;

// to show that each's parameter is map.entry,
// repeat above, but name parameter differently from 'entry'
// it shouldn't matter
myMap1.each { someName ->
    toStr += someName.value + ' ';
}

println toStr;

toStr = '';
// each is also overloaded with 2 parameters, whick
// is the key and value of the map
myMap1.each { a, b ->
   toStr += 'val: ' + b + ', key: ' + a + ', ';
}
println toStr;
package com.gecko.collections

/**
 * Created by hlieu on 12/8/16.
 */
// strlist is a list because ...
def strList = ['str0', 'str1', 'str2'];

assert strList instanceof List<String>

// size is a method of lists
assert strList.size() == 3;

// we can grow it dynamically ... arrays cannot do this
strList[100] = 'str3';

assert strList.size() == 101;

// now we convert it to an array by coercion using the
// keyword as, but we have to do it with a new variable
// so this is the same as String[] newStrList = arrayListVar.toArray(new String[]);
def newStrList = strList as String[];
assert newStrList.length == 101;

assert newStrList[100] == 'str3';


package com.gecko

/**
 * Created by hlieu on 11/15/16.
 */

/*
 * This script demonstrates two main things:
 * 1. the rules of type in Groovy
 * 2. assert is a keyword in Groovy
 *
 *
 * In Groovy, types are
 *  1. optional
 *  2. can be replaced by keyword def to indicate you don't care
 *        ( def means dynamically typed )
 *  3. you have the option of declaring the type
 *
 *  Assert is a keyword in Groovy.
 *
 *  In Groovy, == denotes equality.
 *  In contrast in Java, == denotes identity.
 */

// here i is declared to be of type int, this is strong typing it
int i = 4;
assert i == 4

// here i say i don't care what j is, so i just declare it as a def
// def means the variable will be dynamically typed, which gives it
// the flexibility to change at run time also
def j = 1;
assert j == 1

// but even more importantly, here i don't use either a type or
// the def keyword, and this is perfectly legal
k = 3;
assert k == 3;


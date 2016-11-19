package com.gecko

/**
 * Created by hlieu on 11/17/16.
 */
// a regex test class


def aTestString = "This test string has plenty of stuff to use, like 9 tails, a whip, 15 cats, 2 broomstick witches, and a crazy ex.";

def digits = /\d+/;

def matches = aTestString =~ digits;
matches.each {
    match -> System.out.println(match);
}

def words = aTestString =~ /\w+/;
words.each {
    word -> System.out.println(word);
}
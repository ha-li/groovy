package com.gecko.closures

/**
 * Created by hlieu on 11/19/16.
 */
// in java 5, this is how you handle
// repeating behavior on a list
// for (Item item : itemList ) {
//     dosomething to item
// }
//
// you can do the same with closure
// by doing this
// itemList.each { item ->
//    doSomething to item
// }

// a simple closure on each item in a list
List list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
def output = '';
// list.each takes a closure body which has 1 parameter
// count. we append count and a space char to output
list.each{ count ->
    output += count + ' ';
}

println output;

// reset output
output = '';

// when there is only 1 parameter to the closure,
// the parameter declaration is optional,
// the default parameter name is 'it'
list.each {  // no declaration
   output += it + ' ';
}
println output;

output = '';
// a closure is an object, and this is a method call,
// so it is valid to have brackets after each, but this is
// not the colloquial way of calling a closure, omit the brackets
list.each ({ counter ->
    output += counter + ' ';
});
println output;

//closures are objects of type Closure
// instead of Closure c = new Closure() {}
// the syntax of creating a closure is
Closure c = {
    String line ->
    println line;
}

// an array of lines
String[] lines = [
  "something to print out",
  "a very long line",
  "the last line"
];

// here we pass the closure object to the .each method
lines.each(c);

// we can also define methods to return a closure
def Closure getPrinter() {
    // the curly brackets denote creation of a new Closure object
    return { String line ->
        println line;
    }
}
println "\n\n====using a method to retrieve a closure=====";
lines.each(getPrinter());

// you can call your closures directly by invoking
// it like a method call
println "\n\n====calling my closure directly"
c("somethign strange is going on here!");

// define another closure here
def mini_minus = { x, y ->
    return x - y;
}

// define a closure using the previous closure -- an example
// of currying, in honor of haskell curry
def minus1 = { z ->
    return mini_minus(z, 1);
}

println "\n\na bit of currying here";
println minus1(10);

println "\n\n====you can also call a closure via closure.call(params)";
println minus1.call(20);


// a simple method that has as input parameter a Closure c
// to call c, we invoke it like a normal method c(...);
def simpleMethod(String s, int howMany, Closure c) {
    int times = c(howMany);
    for(int i = 0; i < times; i++) {
        println(s);
    }
}

println "\n\nan example of passing a closure into a method";
simpleMethod("this is super extreme red bull", 6, minus1);

// a more complex ex of a method with a closure as input
// as well, uses another closure inside it
def moreComplex(String template, int cardinal, Closure c) {
    int times = c(cardinal);
    times.times{ txt -> println txt + " " + template; }
}

println "\n\na more complex example of passing a closure into a method";
moreComplex("amazingly wacked up stuff", 4, minus1);

println "\n\npassing in a dynamic closure, here call moreComplex, but the closure is dynamically created, adds 2"
moreComplex("another example of even more wacked up", 4) {
    x ->
    return x+2;
}

println "\n\nanother dynamic closure using the default parameter 'it', adds -2"
moreComplex("fun stuff", 4) {
        return it+(-2);
}
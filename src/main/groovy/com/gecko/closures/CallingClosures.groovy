package com.gecko.closures

/**
 * Created by hlieu on 12/11/16.
 *
 * There are two ways to call a Closure c, :
 *  1. directly calling it like a method ( c () )
 *  2. using Closure.call ( c.call () )
 */


// when a closure is the last variable to a method,
// we can do some pour some syntax sugar on it,
// as in the 2nd call
def benchmark (int repeat, Closure worker) {

   // an int has a method times,
   // times takes a closure,
   // times starts from 0 ... n

   // here the closure is invoked like a method
   repeat.times { worker(it) } ;
}

def callingClosures(int n, Closure w) {

   // here we invoke the closure via call
   w.call(n);
}

benchmark (1000 , { val -> println val } )

// an example of closure syntax sugar
benchmark (2) { val -> println val }

callingClosures (5, { val -> println (5 * val) } )

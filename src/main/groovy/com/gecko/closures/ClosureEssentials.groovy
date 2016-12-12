package com.gecko.closures

/**
 * Created by hlieu on 12/11/16.
 *
 * A class for closures
 *
 * There are several ways to create closures:
 *  1. directly inline (simple declaration)
 *  2. assignments
 *
 * Closures are indicated by { and }. There are only a few places
 * where { and } can be used:
 *  1. class/interface definition
 *  2. if/else blocks
 *  3. for/while/do-while blocks
 *  4. synchronized blocks
 *  5. static/member blocks
 *  6. switch blocks
 *  7. try-catch-finally blocks
 *
 *  Anywhere else besides 1-7 and it is a closure block
 */
class ClosureEssentials {

   // An example of an inline closure, this is like
   // an anonymous class, the closure is not assigned to
   // any variable, and is directly passed to a method
   // that takes a closure as a parameter
   public static void inlineClosure () {

      def total = 0;

      // This is an example of a simple declaration of a closure
      // the closure starts at '{' and ends at '}' .
      (1..10).each( { val -> total += val; } );
      assert total == 55;

      // The above syntax clearly shows that the closure is passed
      // as an argument to the each method.
      // This syntax is so common that a short-hand is to
      // remote the surrounding brackets and just end with the
      // closure starts and ends.
      total = 0;
      (1..10).each { val -> total += val; }
      assert total == 55;

      // The -> operatos says the parameter (val) is passed from the
      // method called into the closure.
      // When there is only one parameter, by default we can omit it,
      // and it implicitly becomes 'it' (kinda analogous to 'this')
      total = 0;
      (1..10).each { total += it; }
      assert total == 55;

      // When there are more then 1 parameter to the closure, they
      // must be named explicitly
      def keyStr = '';
      def valStr = '';
      def map = ['a':1, 'b':2, 'c':3 ];
      map.each { key, value
         -> keyStr += key; valStr += value;
      }
      assert keyStr == 'abc';
      assert valStr == '123';
   }

   // here we will define a closure and assign it to
   // a variable, then use that variable as a
   // input parameter to the method that takes
   // a closure
   public static void assignment () {
      // you can also assign a closure to a variable
      def methodMan = { line
         ->
            line = " $line"
            println line;
      }

      def strs = ["This is a line in a file"];
      strs.each (methodMan);

   }

   // you can return a closure as a return type, in java you
   // cannot do this
   public static Closure getAPrintClosure () {
      return {
         println it;
      }
   }

   public static Closure getAMultiPrintClosure () {
      return { val
         -> for (int j = 0; j < 5; j++ ) {
               println val;
            }
      }
   }

   // closures can be used as an input parameter,
   // infact it is standard practice to have the
   // closure as the last parameter, allowing you
   // to use the standard syntax sugar for calling a closure
   public static void print (Closure p) {
      p( "some text" );
   }

   public static void main(String[] args) {
      inlineClosure ();
      assignment ();
      Closure printClosure = getAPrintClosure();
      print(printClosure);
      Closure multiPrint = getAMultiPrintClosure();
      print(multiPrint);
   }
}

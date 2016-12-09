package com.gecko.collections

/**
 * Created by hlieu on 12/8/16.
 *
 *
 * Groovy lists and arrays are the same.
 * In order to define an array you must either:
 *  1. declare the type as an array, or
 *  2. use the keyword 'as' to coerce a def into an array
 */
class ArrayExample {


   public static void strArrayExample () {

      // An example of declaring an array type
      String[] strArray = ['str1', ' is ', ' a', " String"];
      assert strArray[0] == "str1";
      def output = '';
      strArray.each {
         output += it;
      }

      println output;
   }

   // Another example of type array declaration
   public static void intArrayExample () {
      int[] intArray = [0, 1, 2, 3, 4, 5];
      def total = 0;
      intArray.each {
         total += it;
      }

      assert total == 15;

      assert intArray[0] + intArray[1] == 1;
   }

   // an example of coercion
   public static void intArrayExample2 () {
      def numArray = [0, 2, 4, 6] as int[];

      assert numArray instanceof int[];
      assert numArray.length == 4;

      // show that arrays are not list and that
      // you cannot access the array outside of it's bounds
      // compare this with the ListExample.groovy
      try {
         numArray[5] = 100;
         assert numArray.length == 6;
      } catch (ArrayIndexOutOfBoundsException ae) {
         println "Arrays cannot dynamically grow, in contrast to list";
      }
   }



   public static void main (String[] args) {
      strArrayExample();
      intArrayExample();
      intArrayExample2();
   }
}

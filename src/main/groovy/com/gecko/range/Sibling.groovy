package com.gecko.range

/**
 * Created by hlieu on 12/11/16.
 *
 * A simple implementation of a Range, allowing you to use the
 *  dot-dot operator (..)
 *
 *
 */
class Sibling implements Comparable {
   static final SIBLING = [
           'Oldest Sis',
           '2nd Bro',
           '3rd Sis',
           '4th Bro',
           '5th Bro',
           '6th Sis'
   ]

   private int index = 0;

   Sibling (String name) {
      index = SIBLING.indexOf(name);
   }

   Sibling next() {
      return new Sibling (SIBLING[ (index+1) % SIBLING.size() ]);
   }

   Sibling previous() {
      return new Sibling ( SIBLING[ index-1 ] );
   }

   int compareTo (Object other) {
      // the spaceship operator
      return this.index <=> other.index;
   }

   String toString() {
      return SIBLING[index];
   }

   public static void main (String[] args) {
      def two = new Sibling('2nd Bro');
      def last = new Sibling('6th Sis');

      for( sib in two..last ) {
         println sib.toString();
      }
   }
}

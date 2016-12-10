package com.gecko.numbers

/**
 * Created by hlieu on 12/10/16.
 */
class NumberExample {

   public static void times () {
      def blank = '';
      10.times {
         blank += 'x';
      }

      assert blank == 'xxxxxxxxxx';
   }

   public static void upto () {
      def sum = 0;

      1.upto (5) {
         sum += it;
      }

      assert sum == 15;
   }

   public static void downto () {
      def sum = 0;
      5.downto (1) {
         sum += it;
      }

      assert sum == 15;
   }

   public static void step () {
      def store = '';

      //step (int to, int increment)
      0.step (10, 2) {
         store += it;
      }

      assert store == '02468';
   }

   public static void main (String[] args) {
      times ();
      upto ();
      downto ();
      step ();
   }
}

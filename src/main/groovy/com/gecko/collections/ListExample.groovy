package com.gecko.collections

/**
 * Created by hlieu on 12/8/16.
 */
class ListExample {

   public static void strList() {
      def strList = ['str1', ' this', ' is', ' not', ' an', ' array'];

      try {
         assert strList instanceof String[];
      } catch (AssertionError ae) {
         println "assertion error: strList is not an instance of String[]";
      }

      assert strList instanceof List<String>;
   }

   // an example where a list can be dynamically indexed outside of
   // its boundaries
   public static void listsGrowDynamically () {
      def strList = ['a', 'b'];

      assert strList.size () == 2;

      strList[5] = 'funny stuff';
      assert strList.size () != 2;
      assert strList.size() == 6;
   }

   public static void main (String[] args) {
      strList();
      listsGrowDynamically();
   }
}

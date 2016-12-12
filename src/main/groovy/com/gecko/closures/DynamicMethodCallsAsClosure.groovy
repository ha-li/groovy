package com.gecko.closures

/**
 * Created by hlieu on 12/11/16.
 *
 * Illustrate that closures can act polymorphically.
 */
class DynamicMethodCallsAsClosure {
   int size (List list) {
      return list.size();
   }

   int size (String s) {
      return s.size();
   }

   int size (int x, int y) {
      return x+y;
   }

   public static void main(String[] args) {
      DynamicMethodCallsAsClosure dmc = new DynamicMethodCallsAsClosure();

      Closure methodCall = dmc.&size;
      assert 6 == methodCall ([1, 2, 3, 4, 5, 6]);
      assert 3 == methodCall ("of ");
      assert 12 == methodCall (5, 7);
   }
}

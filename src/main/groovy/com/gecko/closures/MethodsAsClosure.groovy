package com.gecko.closures

/**
 * Created by hlieu on 12/11/16.
 */
class MethodsAsClosure {
   int var;

   public MethodsAsClosure(int v) {
      this.var = v;
   }

   public void printLess (int i) {
      if (i < var) println i;
      else println var;
   }

   public static void main(String[] args) {
      MethodsAsClosure c = new MethodsAsClosure(-1);
      def intList = [0, 1, 2, 3, 4];
      Closure less = c.&printLess;
      intList.each(less);
   }
}

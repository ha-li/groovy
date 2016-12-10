package com.gecko.operators

/**
 * Created by hlieu on 12/9/16.
 *
 * Groovy allows you to define operators for a class
 * by implementing specific methods, for example
 * if you implement the method minus, you can use the - operator.
 *
 * This example is such an implementation.
 *
 */
class MinusOperator {
   private int var;

   public MinusOperator (int v) {
      this.var = v;
   }

   /**
    * The - operator, returns the difference between
    * this.var and i
    * @param i
    * @return
    */
   public int minus (int i) {
      return var - i;
   }

   // Illustrate the use of - operator
   public static void main (String[] args) {
      MinusOperator m = new MinusOperator(10);
      int k = m - 4;
      assert k == 6;
   }
}

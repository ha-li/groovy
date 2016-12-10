package com.gecko.operators

import groovy.transform.Immutable

/**
 * Created by hlieu on 12/9/16.
 */
@Immutable
class EqualsWeirdOperator {
   int value;

   // define equals as true if they are within 1 of each other
   public Boolean equals(EqualsWeirdOperator other) {
      return Math.abs(other.value - value) <= 1;
   }

   public static void main (String[] args) {
      EqualsWeirdOperator q1 = new EqualsWeirdOperator(5);
      EqualsWeirdOperator q2 = new EqualsWeirdOperator(6);
      assert q2 == q1;

      EqualsWeirdOperator q3 = new EqualsWeirdOperator(7);
      assert q3 != q1;
      assert q3 == q2;
   }
}

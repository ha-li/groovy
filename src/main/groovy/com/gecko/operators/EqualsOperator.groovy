package com.gecko.operators

import com.sun.tools.corba.se.idl.constExpr.Equal
import groovy.transform.Immutable

/**
 * Created by hlieu on 12/9/16.
 *
 * By adding the @Immutable annotation (AST)
 * to a class, you by default are overriding the
 * == operator and != operator.
 *
 * == operator is used for equality comparison in Groovy,
 * unlike in java where it is used for identity comparison.
 */
@Immutable
class EqualsOperator {
   int value;

   public static void main (String[] args) {
      EqualsOperator e1 = new EqualsOperator(5);
      EqualsOperator e2 = new EqualsOperator(5);

      assert e1 == e2;

      EqualsOperator e3 = new EqualsOperator(6);
      assert e1 != e3;

      EqualsOperator e4 = new EqualsOperator(10);
      assert e4 != e2;
   }
}

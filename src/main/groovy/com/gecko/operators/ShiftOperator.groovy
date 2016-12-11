package com.gecko.operators

/**
 * Created by hlieu on 12/11/16.
 */
class ShiftOperator {
   public static void main(String[] args) {
      StringBuffer sb = new StringBuffer();
      sb << "Hello World";

      if (sb) {
         sb << '! This buffer is open.';
      } else {
         sb << '. :( This sb failed to open';
      }

      println sb.toString();
   }
}

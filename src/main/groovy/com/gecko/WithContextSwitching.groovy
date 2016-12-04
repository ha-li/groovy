package com.gecko

import com.gecko.type.Address

/**
 * Created by hlieu on 12/4/16.
 */
class WithContextSwitching {
   public static void main (String[] args) {

      // groovy allows context switching by using the
      // with method and a closure, as in

      def address = new Address();
      address.with {
         line1 = "1433 Fruitopia Land";
         line2 = "Version #31";
         city = "Mexico City";
         zipCode = "42117";
         country = "New Zealand";
      }

      println address.line1 + " " + address.line2
      //println line1
   }
}

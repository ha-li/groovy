package com.gecko

import com.gecko.type.Pogo

/**
 * Created by hlieu on 12/7/16.
 */
class PogoUser {
   public static void main (String[] args){
      Pogo pg = new Pogo();

      // this is calling pg.setPg("My pg's pg");
      pg.pg = "My pg's pg";

      // this is calling pg.getPg();
      assert pg.pg == "My pg's pg";
   }
}

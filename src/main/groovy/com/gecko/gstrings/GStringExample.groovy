package com.gecko.gstrings

/**
 * Created by hlieu on 12/10/16.
 *
 * A small program illustrating features of GString:
 *  1. placeholder substitution
 *  2. expression evaluation and substitution
 *
 * Things to keep in mind:
 *  1. GString are not java String (because java.lang.String is final)
 */
class GStringExample {

   public static void closureSubstitution () {
      def randText = 'hey world!';
      println "";
   }

   public static String methodCall  (String text) {
      return "from a groovy script '$text'!";
   }

   public static void expressionSubstitution () {
      def randText = 'hey world';
      // expression substition allows you to make method/closure calls from a
      // gstring -- how cool is that!
      println "I'm shouting to the world ${ methodCall(randText) }";
   }


   public static void placeHolderSubstitution (){
      def randText = 'hey world.';

      // this is the most basic feature of a
      // gstring, the ability to do variable
      // substitution
      println "$randText";
   }

   public static void main (String[] args) {
      placeHolderSubstitution ();
      expressionSubstitution ();
      closureSubstitution ();
   }
}

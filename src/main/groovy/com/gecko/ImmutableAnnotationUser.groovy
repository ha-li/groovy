package com.gecko

import com.gecko.type.ImmutableAnnotationBook
import com.gecko.type.ImmutableAnnotationName

/**
 * Created by hlieu on 12/7/16.
 */
class ImmutableAnnotationUser {
   public static void main (String[] args) {
      ImmutableAnnotationBook book = new ImmutableAnnotationBook();

      try {
         book.title = 'Some random title'
      } catch (ReadOnlyPropertyException re) {
         println 'You cannot modify a property of a class annotated with @Immutable';
         println 'You can only set the property during instantiation through the constructor';
      }

      println 'here is a proper instantiation of an immutable object';
      ImmutableAnnotationBook b2 = new ImmutableAnnotationBook('A stranger in the night');
      assert b2.title == 'A stranger in the night';

      ImmutableAnnotationName name =
              new ImmutableAnnotationName('lastname', 'firstname');

      // here we see that the properties have an expected order
      assert name.firstName == 'lastname';
      assert name.lastName == 'firstname';

      // there is a better way to instantiate an immutable object,
      // by using a map
      ImmutableAnnotationName name2 =
              new ImmutableAnnotationName(lastName: 'lastname', firstName: 'firstName');
      assert name2.lastName == 'lastname';
      assert name2.firstName == 'firstName';
   }
}

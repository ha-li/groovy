package com.gecko.immutable

import groovy.transform.Immutable

/**
 * Created by hlieu on 11/14/16.
 *
 * A pogo class annotated with @Immutable becomes a
 * final class, all it's fields are final,
 * so you cannot change it's value after it's been
 * initialized
 */
@Immutable class ImmutableAnnotationBook {

    String title;
}



package dsl

/**
 * Created by hlieu on 11/30/16.
 *
 * Groovy Category are special classes: Category
 *   1. only have static methods
 *   2. are used to add functionality to a class we did not implement
 *   3. the class that we are adding functionality to is
 *        the 1st argument of the method
 *   4. are applied to a code block with the key word 'use' --
 *        only within the block will the category be applied
 *
 *   in the below example, we are adding functionality to the Number class
 */

class DistanceCategory {
    static Distance getCentimeters(Number n) {
        return new Distance(n, DistanceUnit.centimeter);
    }

    static Distance getMeters(Number n) {
        return new Distance(n, DistanceUnit.meter);
    }

    static Distance getKilometers(Number n) {
        return new Distance(n, DistanceUnit.kilometer);
    }

    static Distance getCm(Number n) {
        return getCentimeters(n);
    }

    static Distance getM(Number n) {
        return getMeters(n);
    }

    static Distance getKm(Number n) {
        return getKilometers(n);
    }
}

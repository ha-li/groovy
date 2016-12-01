package dsl

/**
 * Created by hlieu on 11/30/16.
 */
enum DistanceUnit {

    centimeter('cm', 0.01),
    meter     ('m', 1),
    kilometer ('km', 1000);

    String abbreviation;
    double multiplier;

    DistanceUnit(String abb, double mult) {
        this.abbreviation = abb;
        this.multiplier = mult;
    }

    String toString() { return this.abbreviation; }
}
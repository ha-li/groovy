package dsl

import groovy.transform.TupleConstructor


/**
 * Created by hlieu on 11/30/16.
 */
@TupleConstructor
class Distance {
    Number amount;
    DistanceUnit unit;

    String toString() { return "$amount $unit"; }
    static Distance of(Number num, DistanceUnit u) {
        return new Distance(num, u);
    }
}

package com.gecko.type

/**
 * An example of operator override in groovy
 *
 * Created by hlieu on 11/15/16.
 */
class Modulo {
    int value;
    int modulo;

    public Modulo(int value, int modulo) {
        this.value = value;
        this.modulo = modulo;
    }

    // by defining the method plus, we are saying that
    // client of this class can use + as an operator
    public Modulo plus(Modulo other) {
        if (null == other) {
            return this;
        }
        if (other.modulo != this.modulo) {
            throw new IllegalArgumentException("Cannot add different modulo together");
        }
        return new Modulo((this.value + other.value) % modulo, modulo);
    }

    public Modulo plus(Integer i) {
        if(null == i) { return this; }

        return new Modulo(this.value + i, modulo);
    }

    public String toString() {
        return "val: " + value + ", modulo: " + modulo;
    }

}



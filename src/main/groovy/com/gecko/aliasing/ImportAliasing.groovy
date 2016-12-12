package com.gecko.aliasing


// this does an import with an alias
import java.math.MathContext as MC


/**
 * Created by hlieu on 11/21/16.
 */
class ImportAliasing {
    public static void main (String[] args) {
        double d = -12.03;

        // here we use the alias of the import
        MC mc = new MC(4);
        int e = mc.getPrecision();
        assert e == 4;
    }
}

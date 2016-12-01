package dsl

import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.customizers.*;
//import dsl.Robot;
/**
 * Created by hlieu on 11/28/16.
 */

// an example of a Groovy DSL implementation at the low level,
// this is how it's done.
def binding = new Binding(
        robot: new Robot()
);

def importCustomizer = new ImportCustomizer();
importCustomizer.addStaticStars 'dsl.Direction';

def config = new CompilerConfiguration();
config.addCompilationCustomizers(importCustomizer);
config.scriptBaseClass = RobotBaseScript.name;

def shell = new GroovyShell(this.class.classLoader, binding, config);
shell.evaluate '''
    // simple example of scripting a string
    println 'running shell';
    println 'hello world';
'''

// dsl in a file, script in the file, same bindings above
shell.evaluate "./myscript.groovy"  as File;

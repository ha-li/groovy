package com.gecko.closures

/**
 * Created by hlieu on 12/11/16.
 */
def configurator  = {
   format, filter, line ->
      filter(line) ? format(line) : null
}

def appender = {
   config, append, line ->
      def out = config(line)
      if (out) append (out)
}

// prepends date to the incoming text
def dateFormatter = {
   line ->
      "${ new Date() }: $line"
}

def debugFilter = { line -> line.contains ('debug'); }
def consoleAppender = { line -> println line; }

println dateFormatter ('some text');

def myConf = configurator.curry (dateFormatter, debugFilter);
def myLog = appender.curry (myConf, consoleAppender);

myLog ('a debug statement with the date');
myLog ('this is not displayed');
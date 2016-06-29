#!/bin/sh

JAVA_CMD="java -cp tests/:src/:lib/wyrl-v0.4.6.jar:lib/wyil-all-v0.3.40.jar:lib/wybs-v0.3.34.jar:$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar"

# $JAVA_CMD types.util.TestSuiteRunner $1 $2

# $JAVA_CMD types.util.TestSuiteRewriteStats $1

$JAVA_CMD types.util.TestSuiteGenerator



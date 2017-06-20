#!/bin/sh

JAVA_CMD="java -cp tests/:src/:lib/wyrl-v0.4.6.jar:lib/wyil-all-v0.3.40.jar:lib/wybs-v0.3.34.jar:$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar"

for i in "a" "b" "c" "d" "e"
do
    echo " --- $i ---"
    $JAVA_CMD types.util.TestSuiteGenerator > tests/TestSuite_2_2$i.java
done

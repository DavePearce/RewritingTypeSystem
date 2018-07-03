#!/bin/sh

JAVA_CMD="java -cp tests/:src/:lib/wyrl-v0.4.6.jar:lib/wyil-all-v0.3.40.jar:lib/wybs-v0.3.34.jar:$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar"

TESTS="TestSuite_1_1 TestSuite_1_2 TestSuite_2_1 TestSuite_3_1  WyBench_2 WyC_Tests_2 WyBench_1 TestSuite_2_2 WyC_Tests_1 TestSuite_3_2"

OPTIONS="--rewriting --whiley"

for test in $TESTS
do
    for option in $OPTIONS
    do
	echo "=========================================="
	echo "$test $option"
	echo "=========================================="    	
	$JAVA_CMD types.util.TestSuiteRunner $option $test
    done
done

#$JAVA_CMD types.util.TestSuiteRewriteStats $1

#$JAVA_CMD -Xms4G types.util.TestSuiteGenerator



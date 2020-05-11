# Chapter 05 - Control Statements


Control Statements

A programming language uses control statements to cause the flow of execution to advance
and branch based on changes to the state of a program. Java’s program control statements
can be put into the following categories: selection, iteration, and jump. 

1. Selection statements: Allow your program to choose different paths of execution based upon the outcome of an
2. expression or the state of a variable. 
3. Iteration statements: Enable program execution to repeat one or more statements. 
Jump statements: Allow your program to execute in a nonlinear fashion.

![control-statement-hierarchy.png](images/control-statement-hierarchy.png)

Selection Statements

1. If

An if construct enables you to execute a set of statements in your code based on the result of a condition. This condition must always evaluate to a boolean or a Boolean value. You can specify a set of statements to execute when this condition evaluates to true or false.

![if1.png](images/if1.png) ```
boolean condition = true;
if (condition)  {
  statement1; // code to be executed if the condition is true
  statementN;
}else {
  statement2; // code to be executed if the condition is not true
  statementN;
}
```

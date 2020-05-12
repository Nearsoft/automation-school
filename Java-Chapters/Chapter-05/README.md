# Chapter 05 - Control Statements


Control Statements

A programming language uses control statements to cause the flow of execution to advance
and branch based on changes to the state of a program. Java’s program control statements
can be put into the following categories: selection, iteration, and jump. 

1. Selection statements: Allow your program to choose different paths of execution based upon the outcome of an expression or the state of a variable.
2. Iteration statements: Enable program execution to repeat one or more statements.
3. Jump statements: Allow your program to execute in a nonlinear fashion.

![control-statement-hierarchy.png](images/control-statement-hierarchy.png)

Selection Statements

1. If

An if construct enables you to execute a set of statements in your code based on the result of a condition. This condition must always evaluate to a boolean or a Boolean value. You can specify a set of statements to execute when this condition evaluates to true or false.

![if1.png](images/if1.png) 
```java
boolean condition = true;
if (condition)  {
  statement1; // code to be executed if the condition is true
  statementN;
}else {
  statement2; // code to be executed if the condition is not true
  statementN;
}
```

Multiple flavors of if statements can be used.

1. if.
2. if-else.
3. if-else-if-else.

![if-flavors.png](images/if-flavors.png)

Example:

Write a java program that reads an age variable and prints the following:
  1. If age is less or equal 17 prints child.
  2. If age is greater than 17 prints adult, but...
  3. If age is 80 or more prints elder.
  
  ![if-flavors-example.png](images/if-flavors-example.png)
  
Nested ifs

A nested if is an if statement that is the target of another if or else. Nested ifs are very
common in programming. When you nest ifs, the main thing to remember is that an else
statement always refers to the nearest if statement that is within the same block as the else
and that is not already associated with an else.

Example:
```java
if(i == 10) {
   if(j < 20) a = b;
   if(k > 100) c = d;
   else a = c; 
}
else a = d; 
```
Organized:

```java
if(i == 10) {
   if(j < 20) {
       a = b;
   }
   if(k > 100) { // this if is
       c = d;
   }else { // associated with this else
       a = c;
   }
}
else { // this else refers to if(i == 10)
   a = d;
}
```

The final else is not associated with if(j<20) because it is not in
the same block (even though it is the nearest if without an else). Rather, the final else is
associated with if(i==10). The inner else refers to if(k>100) because it is the closest if within
the same block.

2. switch.

You can use a switch statement to compare the value of a variable with multiple values. For each of these values, you can define a set of statements to execute. 

![switch-diagram.png](images/switch-diagram.png)

Expression must be of type byte, short, int, char, enumeration or String.

Each value specified in the case statements must be a unique constant expression. Duplicate case values are not allowed. The type of each value must be compatible with the type of expression.

The switch statement works like this: The value of the expression is compared with each of the values in the case statements. If a match is found, the code sequence following that case statement is executed. If none of the constants matches the value of the expression, then the default statement is executed. However, the default statement is optional. If no case matches and no default is present, then no further action is taken. 

The break statement is used inside the switch to terminate a statement sequence. When a break statement is encountered, execution branches to the first line of code that follows the entire switch statement. In the absence of the break statement, control will fall through the  remaining  code  and  execute  the  code  corresponding  to  all  the remaining  cases that follow that matching case.

Example:

Write a java program (using a switch statement) that reads a String day variable and prints the following:

* If day is equal to  MON, TUE, WED, THU or FRI, prints time to work.
* If day is equal to SAT or SUN, prints Weekend!.
* If day takes another value, prints invalid day?

![switch-example.png](images/switch-example.png)

```java
String day = "SUN";
switch (day) {
   case "MON":
   case "TUE":
   case "WED":
   case "THU":
   case "FRI":
        System.out.println("Time to work");
       break;
   case "SAT":
   case "SUN":
       	System.out.println("Weekend!");
       break;
   default:
       	System.out.println("Invalid day?");
}
```

Iteration statements

1. while

The while loop is Java’s most fundamental loop statement. It repeats a statement or block while its controlling expression is true.

![while-diagram.png](images/while-diagram.png)

```java
boolean condition = true;
while(condition) {
  statement1; // code to be executed if the condition is true
  ...
}
```

The condition can be any Boolean expression. The body of the loop will be executed as long as the conditional expression is true. When condition becomes false, control passes to the next line of code immediately following the loop. The curly braces are unnecessary if only a single statement is being repeated.

Example:

Write a java program that simulates a counter for a bomb it has to start the countdown in 5 and print countdown as follows:

thick 5
thick 4
thick 3
thick 2
thick 1





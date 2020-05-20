# Chapter 02 - Data Types, Variables, and Arrays

<h1>Data Types, Variables, and Arrays</h1>

Part of Java's security and robustness comes from the fact that it is a strongly typed language. This means that:

1. Every variable has a type
2. Every expression has a type
3. Every type is strictly defined

All assignments are verified for type compatibility. The Java compiler checks all expressions and parameters to ensure that the types are compatible. Any discrepancy between these types is an error.

<h2>Primitive data types</h2>

Java defines eight primitive data types. They can be grouped into four groups: the integers (byte, short, int and long); floating point numbers (float and double); the characters (char) and the booleans (boolean).

<table class="tg">
<tbody>
  <tr>
    <td class="tg-lu0m">byte</td>
    <td class="tg-lu0m">8 bits</td>
    <td class="tg-lu0m">-128</td>
    <td class="tg-lu0m">127 inc</td>
  </tr>
  <tr>
    <td class="tg-lu0m">short</td>
    <td class="tg-lu0m">16 bits</td>
    <td class="tg-lu0m">-32,768</td>
    <td class="tg-lu0m">32,767 inc</td>
  </tr>
  <tr>
    <td class="tg-lu0m">int</td>
    <td class="tg-lu0m">32 bits</td>
    <td class="tg-lu0m">–2,147,483,648</td>
    <td class="tg-lu0m">2,147,483,647 inc</td>
  </tr>
  <tr>
    <td class="tg-lu0m">long</td>
    <td class="tg-lu0m">64 bits</td>
    <td class="tg-lu0m">–9,223,372,036,854,775,808</td>
    <td class="tg-lu0m">9,223,372,036,854,775,807 inc</td>
  </tr>
  <tr>
    <td class="tg-lu0m">float</td>
    <td class="tg-lu0m">32 bits</td>
    <td class="tg-lu0m">1.4e–045</td>
    <td class="tg-lu0m">3.4e+038</td>
  </tr>
  <tr>
    <td class="tg-lu0m">double</td>
    <td class="tg-lu0m">64 bits</td>
    <td class="tg-lu0m">4.9e–324</td>
    <td class="tg-lu0m">1.8e+308</td>
  </tr>
  <tr>
    <td class="tg-lu0m">boolean</td>
    <td class="tg-lu0m"> </td>
    <td class="tg-lu0m">true</td>
    <td class="tg-lu0m">false</td>
  </tr>
  <tr>
    <td class="tg-lu0m">char</td>
    <td class="tg-lu0m"> </td>
    <td class="tg-lu0m">\u0000 (or 0)</td>
    <td class="tg-lu0m">\uFFFF (or 65,536 i)</td>
  </tr>
</tbody>
</table>

The smallest integer type is the byte. This type of data is useful when working with data streams from a network or file.
Short has a range of –32,768 to 32,767. This is probably the least used in Java.
The most widely used integer type is int. Variables of type int are commonly used to control loops and index arrays.
Long is the largest integer, useful when the int is not large enough to contain the desired value.

Floating point numbers, also known as real numbers, are used when evaluating expressions that require fractional precision.
The float type is useful when a fractional component is needed, but a high degree of precision is not required.
However when precision needs to be maintained, for example in many iterative calculations, or large value numbers are being manipulated, double is the best option.

Boolean types only return two values, true and false. It is the type of data that the relational operators return and they are the ones that handle the control declarations like the if and the for.

Java uses Unicode to represent characters. The char range is from 0 to 65,536. Or represented in the ASCI code \u0000 - \uFFFF


<h4>Primitive data types default values</h4>
<table class="tg">
<tbody>
  <tr>
    <td class="tg-lu0m">byte</td>
    <td class="tg-lu0m">0</td>
  </tr>
  <tr>
    <td class="tg-lu0m">short</td>
    <td class="tg-lu0m">0</td>
  </tr>
  <tr>
    <td class="tg-lu0m">int</td>
    <td class="tg-lu0m">0</td>
  </tr>
  <tr>
    <td class="tg-lu0m">long</td>
    <td class="tg-lu0m">0L</td>
  </tr>
  <tr>
    <td class="tg-lu0m">float</td>
    <td class="tg-lu0m">0.0f</td>
  </tr>
  <tr>
    <td class="tg-lu0m">double</td>
    <td class="tg-lu0m">0.0d</td>
  </tr>
  <tr>
    <td class="tg-lu0m">boolean</td>
    <td class="tg-lu0m">false</td>
  </tr>
  <tr>
    <td class="tg-lu0m">char</td>
    <td class="tg-lu0m">‘\u0000’</td>
  </tr>
</tbody>
</table>


<h2>Variables</h2>
A variable is a way to refer to a value that can be changed at runtime. Is the basic unit of storage in a Java program. A variable is defined by the combination of a type, an identifier, and an initializer that is optional.

<h4>Rules for naming variables</h4>

<ul>
<li>All variable names must begin with a letter of the alphabet, an underscore, or (_), or a dollar sign ($).  The convention is to always use a letter of the alphabet.  The dollar sign and the underscore are discouraged.</li>
<li>After the first initial letter, variable names may also contain letters and the digits 0 to 9.  No spaces or special characters are allowed.</li>
<li>The name can be of any length, but don't get carried away.  Remember that you will have to type this name.</li>
<li>Uppercase characters are distinct from lowercase characters.  Using ALL uppercase letters are primarily used to identify constant variables.  Remember that variable names are case-sensitive.</li>
<li>CamelCase recommended.</li>
<li>You cannot use a java keyword (reserved word) for a variable name.</li>
</ul>

<h4>Declaring a variable</h4>
In Java, all variables must be declared before they can be used. This is how a variable is declared in java.

type identifier [ = value ][, identifier [= value ] ...];

Here, type is one of the Java data types. The identifier is the name of the variable. The variable can be initialized by specifying the equal sign and a value. This value must be compatible with the specified type of the variable.
Here are several examples of variable declarations of various types. Note that some include an initialization.

```java
int a, b, c;            //declares three ints a, b and c
int d = 3, e, f = 5;    //declares three more ints and initializes d and f
byte z = 22;            //initializes z
double pi = 3.14159;    //declares an approximation on pi
char x = 'x';           //the variable x has the value 'x'
```

<h4>Dynamic Initialization</h4>
Although in the previous example variables were only initialized using constants, Java allows variables to be dynamically initialized, using any valid expression at the time the variable is declared.
For example, here is a short program that calculates the length of the hypotenuse of a right triangle given the lengths of its two opposite sides.

```java
// Demonstrate dynamic initialization.
class DynInit {
public static void main(String args[]) {
double a = 3.0, b = 4.0;
// c is dynamically initialized
double c = Math.sqrt(a * a + b * b);
System.out.println("Hypotenuse is " + c);
    }
}
```

Here, three local variables are declared: a, b, and c. The first two, a and b, are initialized by constants. However, c is dynamically initialized with the result of the expression in parentheses. 
The program uses another of Java's built-in methods, sqrt (), which is a member of the Math class, to calculate the square root of its argument. The key point here is that the initialization expression 
can use any valid element at the time of initialization, including method calls, other variables, or literals.


<h2>Type Conversion and Casting</h2>
In java it is quite common to assign a value of one type to a variable of another type. If the two types are compatible, Java will perform the conversion automatically (widening conversion). 
For example, it is always possible to assign an int value to a variable of type long. However, not all types are supported, and therefore not all type conversions are implicitly allowed. 
For example, there is no defined automatic conversion from double to byte. Fortunately, narrowing conversion is still possible. To do this, the casting must be used, it performs an explicit conversion between incompatible types.

<ul>
<li>Java’s Automatic Conversions (Widening Conversion)</li>
<li>Casting Incompatible Types (Narrowing Conversion)</li>
</ul>

<h4>Widening Conversion</h4>
An automatic or widening conversion will be done only if the following two conditions are met:
The two types are compatible
Destination type is greater than source type
When these two conditions are met, widening conversion occurs. For example, the int type is always large enough to contain all valid byte values, so an explicit conversion declaration is not required. 
In widening conversion, numeric types, including integers and floating point, are compatible with each other. However, there are no automatic conversions of numeric types to char or boolean. 
Also, char and boolean are not compatible with each other.

Example:
```java
// Implicit type casting
public class Demo {
    public static void main(String[] args) {
        // Casting byte to int type
        byte a = 100;
        int b = a;
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
        // Casting int to long type
        long c = b;
        System.out.println("value of c: "+c);
        // Casting long to float type
        float d = c;
        System.out.println("value of d: "+d);
    }
}

Output:
value of a: 100
value of b: 100
value of c: 100
value of d: 100.0
```

<h4>Narrowing Conversion</h4>
What would happen if we wanted to assign an integer value to a variable of type byte. This conversion will not be done automatically, because a byte is smaller than an int. This type of conversion is called a narrowing conversion, 
since you are explicitly reducing the value to match the target type.
To cast incompatible types, cast is used, which is simply an explicit type of conversion. Here, target-type specifies the desired type to convert the specified value to.

(target-type) value

Example:
```java
// Explicit type casting
public class Demo {
    public static void main(String[] args) {
        // Casting float to long type
        float a = 100.25f;
        long b = (long)a; // It truncates result
        System.out.println("value of a: "+a);
        System.out.println("value of b:"+b);
        // Casting long to int type
        int c = (int)b;
        System.out.println("value of c:"+c);
        // Casting int to byte type
        byte d = (byte)c;
        System.out.println("value of d:"+d);
    }
}

Output:
value of a: 100.25
value of b: 100
value of c: 100
value of d: 100
```

<h2>Arrays</h2>
Arrays are containers of values of the same type. They are useful as a means of storing related information.
Obtaining an array is a two-step process. First, a variable of the desired array type must be declared. Second, the memory that will contain the array must be allocated, using the new operator, and assigned to the array type variable.

type var-name[ ];

array-var = new type [size];

It is possible to combine these two steps and do it in one:
This example assigns an array of 12-element integers and links them to the month_days variable.

Example:
```java
int month_days[] = new int[12];
```

Once an array has been assigned, an element can be accessed by specifying its index in square brackets. All indexes in the array start at zero. For example, this statement assigns the value 28 to the second element of month_days:

```java
month_days[1] = 28;
```

<table class="tg">
<thead>
  <tr>
    <th class="tg-cv9r">0</th>
    <th class="tg-cv9r">1 = 28</th>
    <th class="tg-lu0m">2</th>
    <th class="tg-lu0m">3</th>
    <th class="tg-lu0m">4</th>
    <th class="tg-lu0m">5</th>
    <th class="tg-lu0m">6</th>
    <th class="tg-lu0m">7</th>
    <th class="tg-lu0m">8</th>
    <th class="tg-lu0m">9</th>
    <th class="tg-lu0m">10</th>
    <th class="tg-lu0m">11</th>
  </tr>
</thead>
</table>


<h4>Arrays initializers</h4>
Arrays can be initialized when declared. An array initializer is a comma-separated list of expressions surrounded by braces. Commas separate the values of the array elements. The array will automatically be created large enough 
to contain the number of elements specified in the initializer. By initializing the array in this way there is no need to use the new operator.

The following code creates an initialized array of integers to store the number of days in each month:

```java
class AutoArray {
public static void main(String args[]) {
int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
System.out.println("April has " + month_days[3] + " days.");
    }
}
```

When you run this program, it prints the number of days in April. As mentioned, Java array indexes start with zero, so the number of days in April is month_day [3] or 30.


<h4>Multidimensional Arrays</h4>
In Java, multidimensional arrays are actually array of arrays. To declare a variable of type multidimensional array, each additional index is specified using another set of square brackets. 

For example, the following declares a two-dimensional array variable called twoD:
```java
int twoD[][] = new int[4][5];
```

This assigns a 4 by 5 matrix to twoD.

![bidimensional_array](images/bidimensional_array.png)


<h2>A Few Words About Strings...</h2>
In this session we were talking about java data types and arrays, nothing about String was mentioned. This is not because Java does not support that type, it does. It's just that String is not a primitive type.
Nor is it simply an array of characters. String defines an object, it is used to declare variables of type string. You can also declare string arrays. A quoted string constant can be assigned to a string variable. A variable of type String can be assigned to another variable of type String.
Later, you will see that string objects have many special features and attributes that make them quite powerful and easy to use.
 
# Java Notes
## Note to C++ Programmer

Java does not support pointers and string is not a primitive type.

## Common Programming Language Terms

### Token

The smallest indivisible lexical unit of language. Most of the tokens are separated by white space with some exceptions of ```, : {} []``` etc.

### Literal

A hard-coded value found in code.

### Identifier

The name of an entity in programming language. It can be the name of variable, class, enum, object etc.

### Operators

Tokens that perform built-in language operations such as `+ - / *` etc.

### Expression

A group of tokens mostly literals and identifiers combined with operators to produce a value.

### Statements

Statement is an instruction for computer to execute something.

### Keywords and Reserved Words

Language keywords are tokens that mean something special to language. Sometimes, languges have some reserved words that are reserved for future use and to maintain backward code compatibility of code those words are reserved - so that programmers should not be able to use them as literals
etc.

## Java Language Fundamentals

In linguistics, the word syntax refers to the process of arranging things. It defines the rules and principles of constructing phrases and sentences in a natural language. When you want to learn a new programming language, this first you should do is learn it's syntax. Syntax to programming language is what grammar is to spoken languages. Therefor, in order to learn Java Programming language we have to learn it's syntax - principles and rules for constructing valid code expressions and statements. Java belongs to C family of languages, so if you know C, you already know quiet a bit of Java syntax.

The next step after learning syntax is to learn the keywords. By combining keyword along with proper syntax you can create statements, classes, interfaces etc.

## Statements
Any computer program is a collection of instructions for computer to execute. These instructions are called statements. In Java, statments can a single line of code declaring a variable or a complex mathematical equation. A unit of code in Java is a statement. All statments in Java ends with semicolon. Normally, we put each statement in a separate line for better readability. Some common kinds of statements are as follows.
1. Declaration statements 
2. Assignment statement 
3. Assert statement - assertion checks if a statement is true.
4. Unconditional brancing statment.  
5. Conditional branching statements.
6. if/else of if/else if /else statements
7. switch statement
8. return statement
9. Iteration statments - loop 
    a. while loop
    b. do ... while loop
    c. for loop 
    d. foreach loop
10. continue and break statements
11. throw statment
12. try/catch statments

So, any Java program is made up of one or more classes. Each class will have methods and methods have statement blocks.

Now we will write some examples of the statment types we have described above.

### Declaration and Assignment Statements
Declaration and assignment statment means declare a variable and assign a value to it.

```java
class Example {
  public static void main(Strnig[] args) {
    // Here we are declaring a variable of type int and assigning it a value of 100.
    int num = 100;

    // Declaration and assignment can be done in two separate statements.
    int num2;     // declaration of a variable
    num2 = 200;   // assignment of a variable

    // We can do some operations on these variables and output the result
    int total = num1 + num2;
    System.out.println("Result is " + result);
  }
}
```

### Assertion statements
Assertion checks if a condition is true.
```java
/*
  Asssertions are disabled by default in Java.
  To enable assertions, we have to run the java JVM launcher with -ea flag.
  You can find more information using "man java"
  For this program, we will use java -ea Demo
  --------------------------------------------------------------------------
  When assertions are enabled, and assertion is failed, AssertionError exception
  is thrown.
*/
class Demo {
  public static void main(String[] args) {
    System.out.println("Value of age is " + GetAge());
  }

  static int GetAge() {
    int age = 12;
    assert age >= 21;   
    return age;
  }
}
```
### Program control flow
Statments are executed from top to bottom, unless there is some kind of brancing statement. Branching statements can be unconditional, if/else, if/else if/else, switch or return statements.

```java
/**
 * Branching statments are used for controlling program flow. Noraml flow of program execution is
 * to go from top to bottom.
 * --------------------------------
 * The following example is statements executing top to bottom.
 */
class Demo {
  public static void main(String[] args) {
    int x, y, total;
    x = 2;
    y = 3;

    result = x + y;
    System.out.println("Result is " + result);
  }
}
```

The following example shows how ```return``` statment can transfer the program control flow back to normal, for a block of code ```return``` is normally the last statment.

```java
/**
 * Branching statments are used for controlling program flow. Noraml flow of program execution is
 * to go from top to bottom.
 * --------------------------------
 * In this example we look at unconditional brancing.
 */
class Demo {
  public static void main(String[] args) {
    System.out.println("Program started executing");
    
    /*
      When we call this method, program flow is jumped from main method to the PrintGreetings()
      method, execute all the statements in that method and then the control comes back to main()
      method again.
    */
    PrintGreetins("Jahan"); 

    // Here program control flow comes back to main() method.
    System.out.println("Last statement of the program");

    // Now again calling another method
    int result = Add(23, 32);
    System.out.println("Sum of 23 and 32 is " + result);
  }

  static void PrintGreetins(String name) {
    System.out.println("Greeting! " + name);
  }

  static int Add(int num1, int num2) {
    System.out.println("Adding numbers " + num1 + " " + num2);

    // return statment transfers the program control from this method to callee.
    return num1 + num2;
  }
}
```

Example of using if/else if/ else statements. if/else statement can be nested and are executed from top down.

```java
/**
 * if/else or if/else if/else statement can also change the program control flow from top to down.
 */
class Demo {
  public static void main(String[] args) {
    int age = 12;

    // Check for negative age, and return from the method that in this case will terminate program
    // execution.
    if (age < 0) {
      System.out.println("Age cannot be negative");
      return;
    }

    // Checking various age limits using if, else if and else statements.
    // Only one block of code is executed depending on the conditions.
    if (age < 18) {
      System.out.println("The person is minor");
    } else if (age >= 18 && age < 21) {
      System.out.println("The person is an adult and can buy cigarettes");
    } else if (age >= 21 ) {
      System.out.println("The person is an adult and buy cigarettes and alcohol");
    } else {
      System.out.println("I do not know what to do with this person.");
    }
  }
}
```

```switch``` statement is also another form of conditional branching, and can used in place of multiple if/else if /else statements to make the code more readable. The general syntax of ```switch``` statement is as follows.

```
switch (variable) {
  case <result1>:
    <statements>
    break;
  case <result2>:
    <statements>
    break;
  default:
    // If none of the above cases are true, then the default block is executed.
    <statements>
}

// Another importatnt point to note about switch statement is if break is not executed in a block of case statement, the control is shifted to next case statments until it hits a break statement or the default block is executed.
```

variable in a ```switch``` statment can be of type byte, short, int, long, char, String or enum. `break` statement is optional. `switch` statements can nested. In one `switch` statement, no two cases should be the same. *Normally `switch` statements are efficient than nested if/else*.

```java
/*
  This exmaple shows the use of switch statment.
  Here we are using char type as enum variable.
*/
class Demo {
  public static void main(String[] args) {
    char firstLetter = 'a';

    switch (firstLetter) {
      case 'a':
        System.out.println("First letter is a.");
        break;
      case 'b':
        System.out.println("First letter is b.");
        break;
      default:
        System.out.println("We do not know what first letter is.");
    }
  }
}
```

```switch``` example using Enums

```java
/**
 * In this example we will briefly see how to define an enum, create it's type and use
 * it in a switch statement.
 * -----------------------------------------------------------------------------------
 * Enums in Java are different from enums in C/C++/C#. Enums are static nested classes, 
 * therefore, we cannot decalre enum in a class method.
 * Its better to define enum at package or class level.
 */

enum Days {
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday,
  Saturday,
  Sunday
};

class Demo {
  public static void main(String[] args) {
    Days today = Days.Monday;

    // Here we are grouping multiple case statements, by ommiting break statement.
    switch(today) {
      case Monday:
      case Tuesday:
      case Wednesday:
      case Thursday:
      case Friday:
        System.out.println("It's a work day.");
        break;
      case Saturday:
      case Sunday:
        System.out.println("It's weekend.");
        break;
      default:
        System.out.println("Don't know - what day it is!");
    }
  }
}
```

switch statement example using String data type.
```java
/**
 * switch statment example using String variable
 */
class Demo {
  public static void main(String[] args) {
    String day = "Monday";

    switch (day) {
      case "Monday":
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
      case "Friday":
        System.out.println("It's a workday!");
        break;
      case "Saturday":
      case "Sunday":
        System.out.println("It's weekend.");
        break;
      default:
        System.out.println("I don't know what day it is....");
    }
  }
}
```

### Iteration statements
Iteration statments are used to iterate over a block of code. Java offers four kinds of iteration statements. Iteration statements are also called loops.

#### while loop
```while``` loop iterates over a block of code until the condition specified in the loop is true.

```java
/**
 * Example of while loop.
 * while loop iterates over a block of code, until the condition specified in while loop is true.
 */
class Demo {
  public static void main(String[] args) {
    int i = 1;

    while (i <= 20) {
      System.out.println("Value of i is " + i);
      i++;  // without this increment operation, the while loop will run infinitely
    }
  }
}
```

#### do ... while
```do while``` is very similar to while loop with one distintion and that is it will execute the code once, even if the condition specifed is not true.
```java
/**
 * Exmaple of do ... while loop.
 * do ... while is same as while loop, with one simple distinction and that the code in do block
 * will run once, even if the while condition is false.
 */
class Demo {
  public static void main(String[] args) {
    Boolean result = false;

    do {
      System.out.println("Do block will execute once.");
    } while (result);
  }
}
```

#### for loop 
```for``` loop is designed to iterate over a sequence of numbers generated in the loop statments. ```for``` loop has three parts. First is loop initializing variable, second is condition - as long as this condition is true, the loop will continue, and third is the scheme of generating ranage of numbers.

```java
/**
 * The following example demonstrate the use of for loop.
 */
class Demo {
  public static void main(String[] args) {

    // This loop will generate 10 int numbers and iterate over each.
    for (int i = 1; i <= 10; i++) {
      System.out.println("Value of i is " + i);
    }

    // for loop can made infinite
    for(;;) {
      System.out.println("I will run indefinitely. Ctrl + C to stop.");
    }
  }
}
```

Using the comma  - sometimes in the initialization block of for loop we may need more than one variable. In this situation we can use `,` operator.

```java
class Demo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        
        // In this way, we are only calculating length of array one time at the
        // intialization of loop.
        for(int i = 0, l = nums.length; i < l; i++) {
            System.out.println("Value at index " + i + " = " + nums[i] + ".");
        }
    }
}
```



#### foreach loop

```foreach``` loop allows us to iterate over all the items of a collection like List, Array etc.

```java
/**
 * foreach loop allows to easily iterate over all the items of a collection - array, 
   list etc
  * ---- NOTE ----
   *  foreach loop uses the same keyword for as used in for loop, but uses a 	
      different syntax.
   * The iteration variable of foreach loop is read-only.
 */
class Demo {
  public static void main(String[] args) {

    // String array of names.
    String[] names = {
      "Jahanzeb",
      "Eeshal",
      "Muznah"
    };

    // Using foreach loop.
    for(String n : names) {
      // Since n is read-only, changing it will have no effect on orignal array.
      n = n.toUpperCase();
      System.out.println(n);
    }

    // Printing orignal array. 
    for(String n : names) {
      System.out.println(n);
    }
  }
}
```

### continue and break statements, try/catch blocks
We have already seen one example of break statement in ```switch``` statement. We can also use ```continue and break``` statements to change flow of iterations (loops). In the following example, we are using ```contine and break``` statemens in ```for``` and ```foreach``` loop, but the usage is same for while and do while loop. Also it's good to note that Java does not support ```goto``` statements.

```java
/**
 * This exmaple shows use of contine and break statement.
 * -----------------------------------------------------------------------------------------------
 * 'continue' statment in an iteration loop will stop executing the rest of the statements in loop
 *  and goes to the program execution will jump to next iteration if any.
 * 
 * 'block' statement will stop the loop.
 */
class Demo {
  public static void main(String[] args) {
    // In this example will only print even numbers from 1 t0 20
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      } else {
        continue; // In case of odd numbers - program control is jumped to next iteration.
      }
    }

    // Here we will iterate over names array, and stop execution, if length of string is <= 3
    String[] names = {
      "Jahanzeb",
      "Eeshal",
      "Ann",
      "John Doe"
    };

    for(String name : names) {
      if (name.length() > 3) {
        System.out.println(name);
      } else {
        break;
      }
    }
  }
}
```

The following example shows use of ```throws``` statement and ```try/catch``` block.

```java
/**
 * In this example we will look at use of throw statment.
 * Java handles program error by throwing Exceptions. We use try catch block to handle such code.
 */
class Demo {
  public static void main(String[] args) {
    int p1Age = -2;
    int p2Age = 33;
    
    try {
      System.out.println("p1Age years to retire is " + CalculateYearsToRetire(p1Age));
    } catch (Exception e) {
      System.out.println("Some error happend: " + e.getMessage());
    }

    // Here we are not handling the exception using try/catch block
    System.out.println("p2Age years to retire is " + CalculateYearsToRetire(p2Age));
  }

  /**
   * Calcuate how many years are left for a person to retire. Retirement age is assumed to be 60.
   * @param age - Current age of person
   * @return - years remaining to retire
   * @throws IllegalArgumentException
   */
  static int CalculateYearsToRetire(int age) throws IllegalArgumentException {
    if (age < 0) {
      throw new IllegalArgumentException("Age should be greater than zero.");
    } else {
      return 60 - age;
    }
  }
}
```

Another important concept regarding continue and break is label. Label is a name given to loop. In nested loop situation, we can use break ```label_name``` to jump to outer loop. Same is applicable for continue statement.

```java
/**
 * This example demonstrate the use break and contiue statement with label.
 * This construct is particularly useful, when we want to break outer loop from 
 * nested inner loop.
 */
class Demo {
  public static void main(String[] args) {
    // Consider a situation where we have two dimensional array - 3 X 3 array.
    // We want to first the row and column index of arr.

    int[][] arr = {
      {1, 3, 4},
      {2, 4, 9},
      {3, 3, 3}
    };

    Outer:
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 9) {
          System.out.println("9 found at row " + i + " and column " + j);
          break Outer;
        }
      }
    }
  }
}
```

## Some Java Programs
So far, we have been writing very simple programs. Let's try to write a utility that will take a decimal number as an argument and convert it into binary.

```java
class Demo {
  public static void main(String[] args) {
    // Check for argument and print all the args given by user.
    if (args.length == 0) {
      System.out.println("Usage: java Demo <decimal_number>");
      System.exit(0);
    } else {
      System.out.println("Received " + args.length + " arguments.");
      System.out.println("The arguments are:");
      for (String arg : args) {
        System.out.println(arg);
      }
    }

    int number = 0;
    String binary = "";

    // Convert args to number.
    try {
      number = Integer.parseInt(args[0]);
    } catch(NumberFormatException e) {
      System.out.println("Error: Number must be a base 10 number.");
      System.exit(0);
    }

    // Conver to binary string and print on screen.
    do {
      switch(number % 2) {
        case 0: binary = 0 + binary; break;
        case 1: binary = 1 + binary; break;
      }
      number >>= 1;
    } while (number > 0);

    System.out.println("Binary number is " + binary);
  }  
}
```

## Bitwise Operators
We will discuss bitwise operators in details at a later time. [Good Source](https://users.cs.cf.ac.uk/Dave.Marshall/PERL/node36.html)

In short, shift right by 1 bit divide number by 2 and left shift 1 will multiply number by 2.

```java
/**
 * In the previous example, we have used bitwise right shift operator.
 * Bitwise operator comes in very handy for multipling and dividing number by multiples of 2.
 * Right shift will divide by 2
 * Left shift will divide by 2
 */
class Demo {
  public static void main(String[] args) {
    int number = 100;
    System.out.println("Orignal number is " + number);
    System.out.println("Right shift by 1: " + (number >> 1));
    System.out.println("Left shift by 1: " + (number << 1));

    // To divide by 4 - right shift by 2
    System.out.println("Right shift by 2: " + (number >> 2));
  }  
}
```

## Generating random numbers and Getting user input
We can use java.util package to get access to Scanner and Random classes and using these classes we can get user input and also generate random numbers.

```java
/**
 * This program uses two utility classes from java.util package 
 * Scanner and Random for getting user input and generating random number.
 */

import java.util.*;

class Demo {
  public static void main(String[] args) {
    // Generating a random number
    Random rand = new Random();
    int number = rand.nextInt(6) + 1;

    // Getting user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please guess number: ");
    String input = scanner.nextLine();
    scanner.close();

    // Comparing user input to randomly generated number and give output.
    try {
      int userGuess = Integer.parseInt(input);
      if (userGuess == number) {
        System.out.println("\nUser guess is correct");
      } else {
        System.out.println("\nUser guess in not correct");
        System.out.println("Actual number was " + number);
      }
    } catch (NumberFormatException e) {
      System.out.println("Error: Input a positive integer number.");
    }
  }
}
```
## Comparative Operators
List of comparative operators in Java
Operator | Description
---------| -----------
>        | Greater than
>=       | Greater than or equal to
<        | Less than
<=       | Less than or equal to
==       | Equals to
!=       | Not equal to

## Boolean operators
Following are the Boolean operators in Java.

Operator|Description
--------|-----------
!       | Boolean NOT - inverts the value of boolean expression.
&&      | Boolean AND - results in true if both operands are true.
\|\|    | Boolean inclusive OR - results in true, if any one of the operand is true. If both are true, result is true. If one false and other is true, it will also result in true value.
^       | Boolean exclusive OR - results in true, if only one operand is true. If both are true,           it will result in false.

```java
/**
 * In this code listing, we will simply demonstrate the use of various Boolean operations.
 * Boolean operations will result in a boolean value and that can be used to write conditional
 * statements.
 */
class Demo {
  public static void main(String[] args) {
    Boolean x = true;
    Boolean y = true;

    // Write values of x & y
    System.out.println("Value of x is " + x + " and value of y is " + y);

    // Print result of boolean operations
    System.out.println("Result of NOT x is: " + !x);
    System.out.println("Result of x AND y is: " +( x && y));
    System.out.println("Result of x OR y is: " + (x || y)); // inclusice OR
    System.out.println("Result of x XOR y is: " + (x ^ y)); // exclusive OR
  }
}
```
In addition, to simple explanations of boolean operators also see [DeMorgan's Law](https://en.wikipedia.org/wiki/De_Morgan%27s_laws) for complex logic resolution.

### truth table
a      | b    | a && b | a \|\| b| a ^ b
-------|------|--------|---------|--------
true   |true  | true   | true    | false
true   |false | false  | true    | true
false  |true  | false  | true    | true
false  |false | false  | false   | false 

In Java, boolean logic has a useful property called short circuting - that means the expression is evaluated upto point where a decision can be made. See example below

```java
Boolean x = false;
Boolean y = true;

// Short Circuit
// -----------------------------------------------------------------------------------------------
// In the following expression only x is evaluated, since it is false and we have an AND operation,
// through truth table we can tell, in AND operation if only one value is false, result of 
// expression is false as well. So Java will short circut it and only evaluate x and make the 
// decision.
if (x && y) {
  // some operations here ....
}
```
## Primitive Data Types in Java
Java is strongly typed programming language. Compiler will not infer or try to perform explicit cast of data generally. Programmer has to do these things. There are some excpetions to this rule that we will see in the following examples.

Java supports OOP, but it is not strictly an OOP language, because some of the data types are not objects or referencce types. The types that are not objects are called primitive data types, and the reason for this is get better performance. Although, Java provides wrapper classes for all primitive types.

Primitive types have numbers, booleans and char types. Unlike some other programming languages, where one kind of number will cover all types of numbers, Java differentiates among differnt kinds of numbers. Another major point to note that all types of numbers are signed in Java.

### Identifiers and Literals
Before we go into the detials of different primitive data types, lets look at lexical features of Java. In previous sections we have declared and intialized variables without knowing too much about what is happening.

1. Identifiers - names of entities that a programmer choose to label a variable, class, enum etc.
2. Literals - hard coded values of identifiers

```java
int number = 20;
/* 
  In above statement, we are declaring a variable of type int and assigning it a value of 20.
  'number', the name of variable is called identifier, as later in the code we will using this
  name 'number' to use this variable, and the value 20 is literal - we are hard coding this 
  value and it is not derived from evaluation of an arithmetic expression.
  ----------------
  All integer type literals that we write in a Java program is of type int by default.
  All floating point numbers that we write in a Java program is of type double.
*/
```

### Numbers
Number includes integers and floating points. Unlike C/C++ where width of number types depends upon system, Java has fixed width for all numer types irrespective of platform so that Java byte code can be cross platform.

#### Integers
Numbers with no fractional parts. In order of width (memory occupied) they are byte, short, int, long.

Number Type | Description | Range
------------| ------------|-------
byte        |  8 bits     | -128 t0 127
short       | 16 bits     | -32,768 to 32,767
int         | 32 bits     | -2,147,483,648 to 2,147,483,647
long        | 64 bits     | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

```java
/*
  As we have discussed earlier that all literals are of type int. Here we are assigning 20 to
  type byte named 'b'. It should result in type mismatch as Java is strongly typed language. 
  But it does not happen, if the literal value is in the range of byte -128 to 127 Java will 
  make the conversion for you. Same thing happen for type short as well.
*/
byte b = 20;
short s = 100;

int i = 12340;      // since literal is already an int - no conversion/casting is required.
long l = 124000L;   // for long type we add l or L suffix to the literal value.
```
Interger literals can be written in decimal for as we have been so far, but Java also allows us to write integeral literals in binary, octal and hex notation.

```java
int num1 = 0b10;    // binary - value is 2 - alternate is 0B10
int num2 = 012;     // octal - value is 10 
int num3 = 0xf12;   // hex - value is 3858 - alternate is 0XF12
```

Starting JE6, Java now allow us to input numbers in a human readable manner.
```java
int num1 = 10000000;       // 10 million

int num2 = 10_000_000;    // 10 million - it is easier to read for humans.
                          // At compile time, javac will ignore _ separators.
```
When evaluating any expression involving different data types, Java will cast the value of expression to the widest data type in value in the expression. This automatic widening type conversion rule is also applicable to floating point numbers.

```java
System.out.println("Value of expression is " + (20 + 30 * 10002443234L));
// In this expression (20 + 30 * 10002443234L) -> long data type is widest, so Java will convert
// the value expression to long type.


System.out.println("Value of expression is " + (20 + 30 * 10002443234.123));
// Here the result of this expression will be of type double.
```

#### Floating Point Numbers
Java supports three types of floating point numbers - the numbers with decimal places or fractional parts.

Number Type | Description | Range
------------|------------ | ---------
float       | 32 bits     | 1.4E-045 to 3.45E038 
double      | 64 bits     | 4.9E-324 to 1.8E308

```java
/* 
  Since floating point literal is of type double, we have to use suffix of f or F for float
  literals.
*/
float f = 21.32f; // or it can be 21.32F

double d = 21.092034;
```

float type number range is less than double type, but it also has less precision as well. float has 6 significant digits precision and decimal type has 15 significant point precision.

> Except of some very special use cases, it is normally preferable to use ```int``` type for integral numbers and ```double``` type for floating point numbers.

### Characters
Characters are represented by type ```char```. In C/C++ char is of 8 bytes and then newer standards have added wchar_t, char16_t and char32_t char types in C/C++. In Java, char type width is 16 bits and its range is 0 to 65,536.

First 0 to 127 is ASCII char set, and 0 t0 255 is ISO-Latin-1 char set. All the tricks that we do on char type in C/C++ are also applicable to Java char type.

```java
/**
 * This program demonstrate the use of char data type in Java.
 * Also shows some example of char arithmetic.
 */
class Demo {
  public static void main(String[] args) {
    char c1 = 'a';
    char c2 = 'b';

    System.out.println("c2 - c1 = " + (c2 - c1));
    System.out.println("++c1 = " + ++c1);
  }
}
```
### Booleans
Java offers ```boolean``` type for logical values. Boolean types can only take two values ```true``` or ```false```.

```java
class Demo {
  public static void main(String[] args) {
    boolean b = false;
    System.out.println("Value of b is " + b);

    if (b) {
      System.out.println("b is true.");
    } else {
      System.out.println("b is false");
    }
  }
}
```
## Type Casting in Java
There are three types of casting available in Java.

### Automatic or Widening Casting
Sometimes Java performs automatic conversion from one variable to another. Two conditions must be met for automatic type conversion.

1. The two types are compatible.
2. The destination type is wider than the source type.

Interger and floating point types are compatible with each other as they both represent numbers, but char and boolean types are not compatible.

### Narrowing Casting - Casting Incompatible Types
Suppose we want to convert int type to byte type, int type is wider than byte, so this is incompatible and Java will not perform this casting automatically. We have to cast the value explicitly. It can often lead to unexpected results.

```java
class Demo {
  public static void main(String[] args) {
    byte b = 10;        // Max value is 127
    int i = 1050;

    b = (byte) i;       // Value of 26 is unexpected.
    System.out.println("Value of byte b = " + b);
  }
}

/*
  Output -> Value of byte b = 26
Basically, what happened here is while casting value of int to byte, Java cycles
through all the values of int in quantities of 256 (range of byte -128 to 127 - that 
will be 256). 4 cyles that is 256 * 4 = 1024 went through and at that point the value 
of b should be 0. After the 4th cycle ther are only 26 left and that is assigned as 
value of byte.
*/
```

### Truncation
Truncation happens when we cast a floating point number to an integeral value. Now Java has to truncate the decimal part hence the name.

```java
class Demo {
  public static void main(String[] args) {
    double num1 = 12.34;
    int i = 1;

    i = (int) num1;
    System.out.println("Value of i = " + i);
  }
}

// Here value of i will be 12 as .34 decimal part has been truncated.
```

## Enums
This code here is temporary. It will be shifted to Enum section, when we will cover enums, we will move this code.

```java
/**
 * Example of using main method in an enum
 */
enum Color {
  RED,
  GREEN,
  BLUE;

  public static void main(String[] args) {
    Color c1 = Color.RED;
    
    // Srting representation of Color enum
    System.out.println(c1.toString());

    // Display all values of an enum
    Color arr[] = Color.values();

    for(Color color : arr) {
      // Using ordinal method we can also get index value
      System.out.println(color + "\t" + " @ " + "\t" + color.ordinal());
    }
  }
}
```

## Method Reference Operator
I don't know where to put it for now, but I will soon find a place for it. See explanation in calss comments.

```java
import java.util.*;
import java.util.stream.*;

/**
 * Double color :: is also called Method reference operator.
 * We can all class methods by referring to it's name and method with ::
 * It behaves like lambda functions.
 * :: can be used with static methods, instance methods & constructors.
 */
class Demo {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Jahan", "Eeshal", "Muznah");
    names.forEach(Demo::displayName);
  }

  public static void displayName(String name) {
    System.out.println("Name is " + name);
  }
}
```

## Arrays
Arrays are ordered collection of items of same data type. Arrays are immutable data type, means once you have declared an array, you cannot add more items to it then it's length. If your program requires such facilitation, you should List<T> class, and if for some reason you cannot use List<T>, then you have create a new array from the previous array and create a deep/shallow copy of previous array into the new one depending upon requirements.

```java
// Array declaration
int[] numbers;
numbers = new int[5];   // 5 is array length
numbers[0] = 1;
numbers[0] = 2;
numbers[0] = 3;
numbers[0] = 4;
numbers[0] = 5; // All the work here can be done in one simple line below where we have
                // declared and intialized an array at the same time.

// Alternative array declaration syntax
int numbers[];

// We can initialize the array using alternative syntax, later we add add values to the array.
// When arrays are initialized without giving values, all items are intialized to zero values.
int numbers[] = new int[5];

// Arrays can be decalred and intialized in the same line or separately.
int[] numbers = {1, 2, 3, 4, 5};

// Array length can be found by using length property
System.out.println("Array Length is " + numbers.length);

// Looping over array
for (int i = 0; i < numbers.length; i++) {
  System.out.println("Number at index " + i " is " + numbers[i]);
}
```

## Using VarArgs Feature
VarArgs allows a method to collect multiple arguments with specifying any limit in definition.

```java
/**
 * This example demonstrate the use of varargs featuer.
 */
class Demo {
  static void displayNames(String... names) {
    for(String name : names) {
      System.out.println(name);
    }
  }

  static int add (int... numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += i;
    }

    return sum;
  }

  public static void main(String[] args) {
    displayNames("Jahan", "Eeshal", "Muznah");

    System.out.println("Sum of numbers is " + add(1, 2, 3, 4, 5, 6));
  }
}
```

## The ? Operator

? is also called `ternary` operator that can replace certain types of if-then-else statements.

```java
int a = 10;
int b = 20;
int c = (a > b) ? (a - b) : (b - a);
//       cond      if true   if false

/*
Although paranthesis are redundant in the above statment, but are used for explanation purposes.
The first paraenthesis contains the condition, if condition is true, the second parenthesis is executed and if false third parenthesis after : is executed and c is then assinged a value.
*/
```

## Classes in Java

Classs is the core of Java. It is the logical construct on which the whole Java language is built as it defines object. Any concept that you like to implement in Java must be encapsulated in a class. Also class is the only we can create custom data types in Java.

### What is a class?

Class is a template of data and the algorithms that can be applied to that data. When we are creating a class, not physical structure is built. It's only when we instantiate an object from class, an object is created and placed in memory for further use.

Class code must always be in a single `.java` file. A file can contain multiple classes, but there can only be one public class in a single file.

### Creating Classes and Objects

```java
// How to initialize an object from class.
MyClass myClass = new MyClass();
```

`new` keyword is used to create objects from class and it dynamically allocates memory. Each instance of class will have it's own copy of instance variable and methods. Since, `new` dynamically allocates memory, it might be possible that at some point in program execution, memory is not available (as memory is finite), in this case a runtime exception is thrown.

```java
// This is a simpe class in Java with three instance variables
// or as we call, these represents the data for this class or custom data type
class Box {
  int width;
  int height;
  int depth;
}
```

In addition to instance variable (data), we can define instance methods (algorithms) to be applied on instance variables.

```java
class Box {
  int width;
  int height;
  int depth;
    
    void calculateVolume() {
        System.out.println("Area of this box is " + (width * height * depth) )
    }
}
```

Classes also have constructors. Constructor is a method that runs when a `new` keyword is used. For simple classes we do not have write constructors as Java will automatically provide one. For complex classes we might have to do few other things than just initializing an object and for those cases we write our constructor.

```java
class Box {
  int width;
  int height;
  int depth;
    
    // Constructor - implicitly has a type of Box. We do not have to speicy the type
    // for constructor.
    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }
    
    void calculateVolume() {
        System.out.println("Area of this box is " + (width * height * depth) )
    }
}
```

We can also have parameterized constructors. 

```java
class Box {
  double width;
  double height;
  double depth;
    
  // Constructor - implicitly has a type of Box. We do not have to speicy the type
  // for constructor.
  Box(double w, double h, double d) {
      width = w;
      height = h;
      depth = d;
  }
  
  double calculateArea() {
    return width * height;
  }

  double calculateVolume() {
    return width * height * depth;
  }
}
```
> What's the difference between parameter and argument? Parameter is the variable used by method/function locally. The value that is passed to that method/function when calling it is called the argument.

### this Keyword
```this``` keyword refers to the current object. Using ```this``` keyword, an object can refer to itself. When using instance variables we do not have to use ```this``` keyword, but in cases where local variables shadow instance variables we have to use ```this``` keyword to refer to instance variables or methods. Even if we ```this``` word with instance variables or methods, it's redundant but still valid Java code.

```java
class Box {
  double widht;
  double height;
  double depth;

  /* 
    In this parameterized constructor, local variables are shadowing instance variables, so
    we have to use this keyword to refer to instance variables.
  */
  Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }
}
```
### Assigning Object Reference Variables
Objects created from classes are also called reference types. It means that the object variable is just a pointer to memory where object data and methods exists. Since objects are just pointers they also behave like pointers as well. But all the tricks that we can do with pointers in C/C++ are not applicable in Java due to safety features.

```java
/*
  Assume we have a class named Box - like the one we have programmed earlier, and we created
  an object named b1 out of that class.
*/
  Box b1 = new Box(10, 20, 30);

  // Now we create another Box type variable b2
  Box b2;

  // If we assign b1 to b2, both the variables will refer to the same memory location.
  b2 = b1;
```

### Garbage Collection
In C/C++ programmers have to allocate and free memory manually and that is one of the biggest reason of programming errors in these languages. Luckily, in Java we do not have worry about memory management, because Java has ```Garbage Collector``` that constantly scan for objects with reference in scope and clean the memory.

### finalize method & what not to use it for
We have not discussed a minute detail in above introductory discussion of classes, that is all classes are inherited from Object class and some of the methods are automatically available to all Java classses. One of that method is ```finalize```.

```java
// Syntax for finalize method is
  protected void finalize() {
    // code here....
  }
```

```private``` access modifier restricts access to ```finalize``` method outside the class. This method is called when GC (garbage collector) cleans the object from memory. So it can be thought that this method can be used to free any resources occupied by the object such as file handles etc., but that is not true. The main reason behind is GC will not clean the object as soon as it goes out of scope. GC runs at contant intervals or at the call of JVM, and since we are not certain about the timing when ```finalize``` method will be called, we should not rely on it to free resources. We should rely on other resources to free occupied resources.

### Programming Stack Data Structure
Stack is a common data structure to store values and it works on LIFO principle. So the last value stored on stack will retrieved first. Most implementations of this data structure use ```push``` and ```pop``` methods to store and retrieve values from stack. In next example, we will create a simple class for stack data structure.

```java
/**
 * Class to test stack implementation and containing main method.
 */
public class TestStack {
  public static void main(String[] args) {
    Stack s1 = new Stack();

    // Trying to store 11 items on stack
    for(int i = 1; i <= 12; i++) {
      s1.push(i * 10);
    }

    // Trying to get all the items from stack
    for(int i = -1; i < 12; i++) {
      System.out.println("Popped value is " + s1.pop());
    }
  }
}

/**
 * This class defines an integer stack that hold ten values.
 * It is very naive representation of stack with serious issues 
 * (1) The instance variable stck array that holds all the values can be accessed by code outside 
 *     of class. It should be protected. We will cover this later with access modifiers.
 * (2) Stack has a limitation of only 10 items, theoratically it should not have any limits.
 * (3) The stack is not thread safe and since we have covered thread at this time, we are not 
 *     worrying about thread safety.
 */ 
class Stack {
  // Instance variables
  int[] stck = new int[10];
  int index;

  // Constructor
  Stack() {
    index = -1;
  }

  // Store new item on stack
  void push(int item) {
    if (index == 9) {
      System.out.println("Stack is full.");
    } else {
      stck[++index] = item;
    }
  }

  // Retrieve last item stored on stack
  int pop() {
    if (index < 0) {
      return 0;
    } else {
      return stck[index--];
    }
  }
}
```
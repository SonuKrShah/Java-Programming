# Exception Handling

## Introduction
## Exception
## Error
## Difference b/w Error & Exception
## Types of Exception
## Exception Keywords
## Multiple Catch block example program
## Nested try block example program
## Finally block
## throw Keyword
## throws Keyword

### Personal Notes

Exception in java are any abnormal unexpected events or extraordinary conditions that may occur at runtime.

Example: 

Consider an ATM, we have a normal flow.

Some of the exceptional situations apart from the normal flow are as follows:

* There's no cash in the ATM
* The amount entered is in multiples of 100 and there's no 100's notes in the machine.
* The pin number is incorrect
* The balance is less then the amount entered.

> Note: Through exception handling, we can make our software robust i.e., it can handle different edge cases as well.

#### Handling an exceptional situation

When an exceptional situation occurs, our code jumps from that point to a default catch mechanism.

> Note: In case of the default catch mechanism, the program terminates then and there. To avoid this from happening, we can use custom catch mechanism.

##### Some problems with the default exception handling:

* A proper error message is not printed that is understood by everyone.
* The program terminate.

To overcome this, we have to use custom exception handling.

##### Different combinations of exception handling

* Default throw and default catch
* Default throw and our catch
* Our throw and default catch
* Our throw and our catch

Java exception handling is used to handle error conditions in a program systematically by taking necessary action.

#### Hierarchy of Error and Exception classes in Java

* Throwable class is the superclass of all the errors and exceptions in Java. Only objects that are instance of this class(or one of it's subclass) can be thrown by the Java Virtual Machine.

* Error and Exception are the two child classes of throwable.
* Exception class has various subclasses like IllegalArgumentException,	NullPointerException.

#### throw and catch Keywords

Java exceptions are raised with the throw keyword and handled within a catch block.

#### Throwable

* Throwable class provides a string variable that can be set by the subclass to provide a detail message that provides more information of the exception around.
* All classes of Throwable define a one parameter constructor that takes a string as the detail message.
* The class Throwable provides getMessage() function to retrieve an exception.

## Types of exceptions

Exceptions can be of two types:
* Checked Exception - Compile time	Exceptions
* Unchecked Exceptions - Run time Exceptions

### Unchecked Exceptions

These are runtime exceptions. Eg: ArrayIndexOutOfBounds, NullPointerException, are subclasses of RuntimeException class which is a subclass of Exception class.

> Note: all the exceptions belonging to RuntimeException and it's decendents are part of Unchecked exceptions. Others are known as checked exception.

### Some important Keywords

* try - In this block, we write the code where there's a chance of exception.
* catch - As the name, this block is responsible to catch the different exceptions. It takes an argument i.e., an Exception and it's reference variable.
* finally - It is not mandatory to write but it has a separate usage. It gurantees that the code will run even if there's no exception occured.

> Note: After every try block, we need to have either a catch or a finally block or both.

> Note: If at any line an exception occurs at a try block then the subsequent line will not run in the try block. The control directly jumps to the catch or finally block.

#### Remember about try catch

* For each try block there can be zero or more catch blocks, but only one finally block.
* The catch block and finally block must appear in conjunction with a try block.
* A try block must be followed by either atleast one catch block or one finally block.
* The order of exception handlers in the catch block must be from the most specfic exception.

### Explicit Exception throw in Java.

A program can explicitly throw an exception using the throw statement besides the implicit exception thrown.

##### Syntax
`throw <throwableInstance>`

* The Exception reference must be of type Throwable class or one of its subclasses.
* A detail message can be passes on to the constructor when the exception object is created.

> Why should we throw an exception object?
* Because we want to set a different message.
* Because java cannot recognize exceptional situation of business logic.

### throws keyword

#### Compile Time Error in Checked Exception

* Checked exception forces programmers to deal with the exception that may be thrown.
* IOException, SQlException, IllegalThreadStateException etc are checked exceptions.
* checked means they will be checked at compile time itself.

Here the comipler detects some situations like connecting to database, where some exceptions might occur.
Here we use throws keyword when there are checked exceptions.

#### Facts about throws keyword

* The throws keyword in java programming language is applicable to a method to indicate that the method raises particular type of exception while being processed.
* The throws keyword in java programming language  takes arguments as a list of the objects of type java.lang.Throwable class.

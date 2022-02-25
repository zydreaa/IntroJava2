package com.company;

public class Main {

    public static void main(String[] args) {
	// What is Java?
        // Java is an object oriented programming language  that allows us to model
        // real life functionality as objects in our code.

        //Features of Java
        // Java is a strictly-typed language.
        // Java is also a complied language. it is turned into 'bytecode'
        // Java is a high-level language.
        // Java is run on the JVM (JAVA Virtual Machine).
        // The JVM creates platform independence for Java.

        // What is the computer programming?
        // Computer programming is a process of giving a computer or IT device a series of instructions
        // that tell it the order and process in which to carry out or execute a specific task or set of tasks.

        // Concepts of programming in Java
        //data types
        //variables or data types
        //conditionals
        //loops
        //methods
        //classes

        //Variables and Datatypes
        //primitive values
        //byte
        //short (smaller version of integer)
        //int (Integer)
        //char
        //long
        //float // has a max of 7 decimal places
        //double // has a max of 15 decimal places

        //complex objects
        //strings

        //variable: think of a variable like an empty box, where as soon as you create the box,
        //you decide what type of times you can put in the box and you cannot put a different typy
        //of item later on.

        //P.S.: You cannot have a variable with the same scope in Java.

        //A variable declaration is simply giving your variable a name and a data type.
        //A variable initialization is the point where you finally give that variable a value to start with.

        int number; //variable declaration
        number = 4; //variable initialization.

        int value = 6; //variable declaration and initialization in one line.
        byte byteValue = 1;

        //char charValue = 'u';
        //String text = "I am going yo school";

        //long digits = 5L;

        //float decimalFloat = 3.683f;
        //double decimalDouble =5.232353232;

        //Shortcut to comment a line of code: command + /

        //Arithmetic Operators include:
        // + - Addition
        System.out.println("Addition of number and value is :" + (number + value));
        // - - Subtraction
        System.out.println("Subtraction of number and value is :" + (number - value));
        // / - Division
        System.out.println("Division of number and value is :" + (number / value));
        // * - Multiplication
        System.out.println("Multiplication of number and value is :" + (number * value));
        // % - Modulus (it divides the values and returns the reminder) e. g. 2% 2 -> 0
        System.out.println("Modulus of number and value is :" + (number % value));

        // = Assignment


        //A comment is a piece of text in your code that isn't executed by the computer.

        //Our first Java program
        System.out.println("Hello World");
    }
}

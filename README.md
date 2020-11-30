# java_stringManipulation

## String Manipulation
You've been asked to implement a series of string manipulation methods. To do these, you will need to utilize built in string methods. Use the StringManipulator and StringManipulatorTesting classes. Below are the method signatures and a short description of the method to be implemented.

**Objectives:**

● Practice method signatures by implementing the tasks below.

● Implement some of the most used string methods.

**Tasks:**

Create a StringManipulator class that implements the following methods:

● String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class.

```java
StringManipulator manipulator = new StringManipulator();
String str = manipulator.trimAndConcat("    Hello     ","     World    ");
System.out.println(str); // HelloWorld 
```
● Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.

```java
StringManipulator manipulator = new StringManipulator();
char letter = 'o';
Integer a = manipulator.getIndexOrNull("Coding", letter);
Integer b = manipulator.getIndexOrNull("Hello World", letter);
Integer c = manipulator.getIndexOrNull("Hi", letter);
System.out.println(a); // 1
System.out.println(b); // 4
System.out.println(c); // null
```
● Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.

```java
StringManipulator manipulator = new StringManipulator();
String word = "Hello";
String subString = "llo";
String notSubString = "world";
Integer a = manipulator.getIndexOrNull(word, subString);
Integer b = manipulator.getIndexOrNull(word, notSubString);
System.out.println(a); // 2
System.out.println(b); // null
```
● String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the substring method of the String class.

```java
StringManipulator manipulator = new StringManipulator();
String word = manipulator.concatSubstring("Hello", 1, 2, "world");
System.out.println(word); // eworld
```
Then create a StringManipulatorTest to test all these methods.

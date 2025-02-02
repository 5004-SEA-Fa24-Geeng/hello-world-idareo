# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

mermaid
---
title: Aloha World UML
---
classDiagram
direction LR
AlohaWorld --> Greeter
AlohaWorld --> ConsoleView : uses
ConsoleView --> Greeter : uses
class AlohaWorld {
- AlohaWorld()
+ main(string[] args): static void
}
class Greeter {
- name: final String
- locality: int
- localityList: static List<String>
- HAWAII: static final int
- CHINA: static final int
- ITALY: static final int
- DEFAULT_LOCALITY: static final int
+ Greeter(string name, int locality)
+getName(): string
+getLocality(): int
+setLocality(int locality): void
+greet(): String
+greet(boolean asciiOnly): String
+getLocalityString(): String
+hashcode(): int
+equals(Object obj): boolean
+toString(): String
+getLocalityList(): Static List<String>
}
class ConsoleView {
- Scanner: static final Scanner
-Locality_options: static final List<String>
-ConsoleView()
+getName(): static String
+getLocality(): static int
+checkRunAgain(): static boolean
+printGreeting(string greeting): static void


    }



### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).
   The AlohaWorld.java holds the main function as a static void, allowing it to be called without creating an object of the class. 
   The ‘void’ allows it to run without requiring a return at the end. The main proceeds to call on the ConsoleView class that is used to interact with the client. 
   The ConsoleView is then assigned to the name variable by using the getName() method. 
   This method allows the program to ask the user for input and then proceeds to scan the input, strip it of excess white space and return it to the method. 
   After this, the main then assigns the locality by calling on the getlocality() method in the ConsoleView.Java class. Once both variables are assigned, 
   the main program calls on the Greeter.Java class and creates a new instance of the greeter class. The aforementioned name and 
   locality variables are then passed through the Greeter(String name, Int locality) method. This handles any exceptions that could occur due to the size of the locality. 
   If the Greeter method runs without throwing the IllegalArgumentException, then the new instance is passed back to the ConsoleView.printgreeting() method which will print the greeting. 
   The final step in the main calls on the consoleview.checkrunagain() method. This is used to ask the user if they would like to be greeted again. If false, 
   the program accesses the getlocality function within the ConsolleView class and sets the locality within the greeter class via the setlocaliy() method. It then prints the greeting again, 
   until the user inputs ‘yes’ to quit.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * (example) `final class`
   * NumberFormatException
   * Integer.parseInt
   * SCANNER.nextLine().toLowerCase()

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .

3. What does `main` do in Java? 

    Go ahead and answer the question as a short paragraph / few sentences. Notice the indent, this is valid because it is a list item. (erase this line before writing.)


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    Same as above - short answer

5. What is javadoc style commenting? What is it used for? 

    Same as above - short answer


6. Describe Test Driving Development (TDD) in your own words. 

    Same as above - short answer    

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?


2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.



> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java
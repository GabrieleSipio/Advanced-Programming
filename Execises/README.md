# Contents

## Exercise 1

Using NetBeans create a simple Java program that takes some strings from the command line, sorts them using the method Arrays.sort and prints the ones whose length is even.

* **Goal:** Checking that the NetBeans installation works; starting simple Java coding.
* **Expected output:** Simple Java class working as described.

## Exercise 2

Check the differences between files _StrangeOne.java_ and _StrangeTwo.java_. Compile them, disassemble the obtained classes using _javap -c_ and inspect the _byte-code_ of the method _sum_. Is the byte-code the same? Can you explain why?

* **Goal:** Using javap for disassembling Java code; inspecting simple bytecodes.
* **Expected output:** One short sentence answering the two questions.

## Exercise 3

Run the program WrongQueue and inspect its behaviour using visualvm. Can you explain the continuos growth of the heap? Find the code causing the bug and fix it.

* **Goal:** Using visualvm to inspect the memory consumed by a Java program; Reviewing Java code to detect non-trivial errors; Fixing bugs
* **Expected output:** One sentence identifying the bug in the code; A revised version of the class with minimal changes to fix the bug.

## Exercise 4

Run and inspect the program GCstrange using visualvm, in particular check the evolution of the heap, the activity of the GC and the activity of the Finalizer thread. Using GCstrange as a template, write a simple class that overrides the method finalize in order to count how many times the garbage collector is invoked. Write a main to test this class.

* **Goal:** Understanding the finalization of objects in Java; exploiting the finalize method to infer simple properties of garbage collection.
* **Expected output:** A clear explanation of why the occupation of the memory increases during execution of the given program; a working Java program implementing the given specification.

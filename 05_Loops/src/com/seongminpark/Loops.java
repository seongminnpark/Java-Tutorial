package com.seongminpark;

import java.util.ArrayList;
import java.util.List;

/**
 * Final lesson on Java semantics, we learn loops!
 * @author seongmin
 *
 */
public class Loops {

	/**
	 * Yaay Loops!
	 * @param args Command line args.
	 */
	public static void main(String[] args) {
		/* Congratulations on reaching the final lesson involving essentials of Java!
		   Loops is the last installment in this sequence of lessons you have to go through before you know everything necessary to code just about anything.
		   Everything else after this chapter can all be swept under the "Best Practices", or "Conventions" category, to be honest. 
		   And loops are super easy, so you are practically all set as you're reading this. */
		
		/* Before we get into what loops are consider this situation:
		   You have a variable x. x is set to 0. 
		   You want to increment x. By 10. 
		   You want to do this many times, until x becomes 100.
		   You also want to print every step in the process, and we understand because everybody is weird in their own way. */
		
		int x = 0;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		x += 10;
		System.out.format("x: %d%n",x);
		
		/* Niiiiiice, right? We grew x to 100. But I almost got a carpal tunnel syndrome typing all that +='s. Here is where loops come in. */
		int y = 0;
		while (y <= 100) { // This is a "while loop".
			System.out.format("y: %d%n",y);
			y += 10;
		}

		/* Loops look similar to conditionals. 
		   The expression in parenthesis is also a condition. 
		   The loop body in curly braces will only execute if the condition is true.
		   The only difference is: the loop body will repeat forever until the condition is false. (or WHILE the condition is true, wink wink) 
		   It checks the condition BEFORE and AFTER each loop. (Which is only once per loop, if you think about it) */
		
		/* There is one other kind of loop, called the "for loop". Its mechanism is the same. 
		   The loop body will repeat until the condition is false.
		   The only difference is, we know exactly how many times the loop body will repeat before the condition turns false. 
		   So it is possible to say "repeat for n times". Hence the name "for loop". */
		int z = 0;
		for (int i=0; i <= 10; i++) {
			System.out.format("z: %d%n",z);
			z += 10;
		}
		/* Breaking down the loop above:
		   - Notice the condition is broken down into three sections.
		   - Here is a variable "i" that we will only use in this for loop, repeat until i <= 10 is true, increment i by 1 after each loop.
		   - Loop body will execute while the condition above is true.
		   
		   Notice a for loop executes in the same manner as a while loop, but only the format of the condition differs.
		   Also, after the loop exits, variable i will be erased from the program. 
		   
		   Different use cases call for different types of loops. */
		
		// The same count-to-100 example, done slightly differently.
		for (int i=0; i <= 100; i+=10) {
			System.out.format("i: %d%n",i);
		}
		
		
		/* Using loops in conjunction with lists is quite convenient. */
		/* Say we have a list of names we want to say hello to. */
		List<String> namesToSayHiTo = new ArrayList<String>();
		namesToSayHiTo.add("Alice");
		namesToSayHiTo.add("Bob");
		namesToSayHiTo.add("Carl");
		namesToSayHiTo.add("Danny");
		namesToSayHiTo.add("Emily");
		namesToSayHiTo.add("Faaa");
		System.out.format("List of names: %s%n", namesToSayHiTo.toString());
		
		/* Using a for loop, we can index into each entry in the list. */
		for (int i=0; i < namesToSayHiTo.size(); i++) { // i< size, because indices start at 0.
			String name = namesToSayHiTo.get(i);
			System.out.format("Good morning from a for loop %s!%n", name);
		}
		
		/* Ever received one of those emails where they greet you as "$username" or "$customerInfo"?
		   The sender wanted to do what we just did but made a mistake. */
		
		/* It is important to remember for loop and while loop are very interchangeable. 
		   Usually when we know exactly how many times we want to loop we use a for loop. 
		   When we are unsure, we use a while loop. Below is code that does exactly the same thing, but with a while loop. */
		int index = 0;
		while (index < namesToSayHiTo.size()) {
			String name = namesToSayHiTo.get(index);
			System.out.format("Good morning from a while loop %s!%n", name);
			index += 1;
		}
		
		
	   /* Because people use loops so much to index into lists(or other collections), 
	      Java has a special syntax for iterating through a collection using a for loop. */
		for (String name : namesToSayHiTo) { // (for each name(of type string) in list namesToSatHiTo)  
			System.out.format("Good morning from a second for loop %s!%n", name);
		}
	}

}

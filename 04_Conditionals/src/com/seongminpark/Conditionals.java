package com.seongminpark;

/**
 * Introduction to conditionals.
 * Conditionals are useful tools in determining program flow.
 * @author seongmin
 *
 */
public class Conditionals {
	
	/**
	 * Run through conditional examples. 
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		/* Conditional is more often called an "if statement".
		   That is all this is. 
		   
		   As your program executes from line 1 to line 999, sometimes there might be features of your program 
		   that you want to execute in only certain cases (e.g. presenting a reward only if a user reaches a certain level).
		   
		   Conditionals are put into place to implement this condition-based behavior of a program.
		   
		   Naturally, for a conditional to exist there must be a condition to check for. 
		   When the program encounters a conditional syntax, it checks the condition specified within the conditional.
		   
		   The following is the template for a conditional syntax.
		   
		   if (condition) {
		       Code to execute if condition is true
		   } else {
		       Code to execute if condition is false
		   }
		   
		   In the conditional block above, if the two paths of execution are mutually exclusive.
		   This is because our condition has to be EITHER true OR false, but not both. 
		   
		   But what does it mean for a condition to be true?
		   What does true and false even mean in Java?
		   For this we introduce booleans.
		   
		   boolean is a type, like int, float, or string.
		   But unlike those types that can hold infinite variations of values(an int value can be 1,2,3,4,5, a string "h", "hh", "hhh" and so on),
		   a variable or value of type boolean can only be assigned to hold either true or false -- failing to do so will result in a compile error.
		   true and false is are special keywords in java. They are raw values, just like 1,2,3,4,5, of type boolean.
		   
		   You can see how this could be useful.
		    
		 */
		
		// Some conditional and boolean examples:
		
		boolean yourCarIsAFerrari = true; // Booleans depict true or false.
				
		if (yourCarIsAFerrari) { // Notice how a boolean value fits right in as a conditon
			System.out.println("Welcome to the Ferrari club.");
		} else {
			System.out.println("Yer not a member of the Ferrari club.");
		}
		
		/* The conditional block above will print "Welcome to the Ferrari club."
		   This is because, like we said before, the condition of our if block was evaluated to be true, which led the program to execute the if block.
		   It is worth noting that if the condition evaluates to be true, the else block will not even be considered. 
		   You COULD put bad runtime errors in there. But you wont. Because good programmers always consider cases where 
		   some stray input might lead the program into the most unexpected execution path */
		
		/* According to convenience, there can be some variations on conditional structure. 
		   We introduce the "else if" keyword. Guess what the next conditional block will print. */
		
		boolean yourCarIsAPorche = false; // Another boolean for the sake of this example.
		
		if (yourCarIsAPorche) { // Notice how a boolean value fits right in as a condition
			System.out.println("Welcome to the Porche club.");
		} else if (yourCarIsAFerrari){
			System.out.println("Welcome to the Ferrari club.");
		} else {
			System.out.println("You must be kidding.");
		}
		
		/* The block above, again, will print "Welcome to the Ferrari club."
		   "else if" statements are how we add additional conditions to check for in our conditionals.
		   Since always want to signal the start of a conditional block with an "if", we use "else if" for every additional condition.
		   The program will check if the condition of the leading "if" is true, check the following "else if"(if there is any) is true, check the next "else if",
		   and so on. There can be as many "else if"s as you want. 
		   
		   ONLY CODE IN THE THE FIRST MATCHING CONDITION BLOCK WILL EXECUTE.
		   
		   This means if you see an "if", only one of all its branches will execute. 
		   Adding "else" or "else if" is optional.  */
		
		/* But what if you want to perform special operations on your conditions? 
		   Here we introduce a neat feature in programming:
		        Given an expression that will evaluate to a value of certain type, one can use that expression in place for values of that type.
		   
		   What this means is: we can write things like "2 > 5" or "x < 9" or "y - 99 + 23232323 < 9238938 + 489348" as our conditions, because all
		   these conditions will effectively boil down to a single boolean value, either true or false.
		   
		   We can even combine two boolean expressions(which are our conditions, but addressed more formally) to form a single big boolean expression.
		   Again, the principle above comes into play. The operators we use are &&(and) and ||(or).
		   
		   Take a look at code examples below. */
		
		boolean bothFarrariAndPorche; // This expression denotes whether you have both a Ferrari and a Porche.
		bothFarrariAndPorche = yourCarIsAFerrari && yourCarIsAPorche; // Makes sense, right? You have to have one AND the other. Both. So we use &&(and).
		System.out.format("Do you have both?: %b%n",bothFarrariAndPorche);
		/* For an && operation to yield "true", both operands has to be true.  Take a look at the || operator below. */
		
		boolean eitherFarrariOrPorche; // Do you have at least one of Ferrari or Porche?
		eitherFarrariOrPorche = yourCarIsAFerrari || yourCarIsAPorche; // Again, just like talking in real life. We would say OR, right?
		System.out.format("Do you have one of either?: %b%n",eitherFarrariOrPorche);
		
		/* On your own time, study some boolean arithmetic. DeMorgan's law at least. */
		
		
	}

}

package com.seongminpark;

import java.util.ArrayList;
import java.util.List;

/**
 * Learn about lists.
 * @author seongmin
 *
 */
public class Lists {
	
	/**
	 * List examples!
	 * @param args Command line args..
	 */
	public static void main(String[] args) {
		/* What is a list? 
		 A List is a data structure that stores a group of values. 
		 
		 Better yet, have this memorized: a list is an ordered collection of elements.
		 With emphasis on ORDERED and COLLECTION.
		 
		 - Ordered: Being a storage solution, lists will have no use if its elements change their spots inside the list.
		            We wont be able to find what we store.
		 - Collection: Any number of Java entities can group up to make up a list.
		 - Element: Kept vague in purpose. These can be of any type.
		 
		 Before we get into specific syntax consider this example:
		 
		 A perfect analogy of a list is an apartment. 
		 
		 An apartment is ordered in that if you visit every room from the first floor to the topmost, 
		 you will encounter every resident -- element -- in the same order each time you traverse.
		 
		 An apartment is a collection in that more than one person occupy a single apartment.
		 
		 When you are confused about lists, just remember it is nothing more than a motel. */
		
		/* How to make a list:
		   Syntax:  List<Type> listName = new ArrayList(); 
		                            OR
		            List<Type> listName = new LinkedList();  
		   
		   Two things to take away from this:
		       1. There are two kinds of general purpose lists: ArrayList and LinkedList.
		          The difference is basically: ArrayList puts elements together in memory, 
		                                       LinkedList scatters elements across in memory.
		          You will use ArrayLists.
		          
		       2. A list can hold any number of values, but they all have to be of the same type 
		   
		   Consider the following code(finally!): */
		
		List<String> freeRotationsThisWeek = new ArrayList<String>(); // Made a new list.
		freeRotationsThisWeek.add("Garen"); // Add elements with add().
		freeRotationsThisWeek.add("Galio"); 
		freeRotationsThisWeek.add("Gangplank");
		System.out.format("Added three initial champs: %s%n",freeRotationsThisWeek.toString());
		// What if we add Gangplank again?
		freeRotationsThisWeek.add("Gangplank");
		System.out.format("Are duplicate values added twice?: %s%n",freeRotationsThisWeek.toString());
		// First and second Gangplanks have the same value, but they are not the same object.
		// What if we add the same object?
		String graves = "Graves";
		freeRotationsThisWeek.add(graves); // Notice we can add values with variable names.
		freeRotationsThisWeek.add(graves);
		System.out.format("Are same objects added twice?: %s%n",freeRotationsThisWeek.toString());
		// Yeah of course they are added twice. This is a list, not a set.
		freeRotationsThisWeek.remove("Garen"); // Remove elements with remove().
		System.out.format("Removed Garen: %s%n",freeRotationsThisWeek.toString());
		// What if we remove values that were inserted multiple times?
		freeRotationsThisWeek.remove("Gangplank");
		System.out.format("How many Gangplanks will remain: %s%n",freeRotationsThisWeek.toString());
		// Removes the first occurrence.
		// Get the size of list.
		System.out.format("How many elements: %d%n",freeRotationsThisWeek.size());
		
		/* Remember, refer to java docs as the need arises for specific list functionalities. */
		
		/*
		Another resemblance of lists we find in apartments is how we access elements in the collection.
		Say you want to deliver a mail to Bob. Bob lives in this huge apartment building.
		
		You need to know the room number -- which is an integer, of course -- in order to deliver the mail. 
		
	    Each room in a list is also assigned a room number. We call one such number an index. << super important!
	    Indices start from 0!!!!!!!!!!
		 
		So we have direct access to a list slot(a spot in your ram) if we have an index, 
		just like we know where to find Bob only after we figure out what room number we are headed to. */
		
		List<String> apartmentA = new ArrayList<String>();
		apartmentA.add("Alice");
		apartmentA.add("Bob");
		apartmentA.add("Carl");
		apartmentA.add("Dan");
		System.out.format("Initialized apartmentA: %s%n",apartmentA.toString());
		
		// Access an element at index i by using listName.get(i).
		System.out.format("First index: %s%n", apartmentA.get(0));
		System.out.format("Second index: %s%n", apartmentA.get(1));
		System.out.format("Third index: %s%n", apartmentA.get(2));
		System.out.format("Fourth index: %s%n", apartmentA.get(3));
		
		// Remove element at index i. Elements in higher indices will shift down.
		apartmentA.remove(1);
		System.out.format("Removed Bob: %s%n",apartmentA.toString());
		
		// Inserting an element at index i will shift elements in higher indices upward.
		apartmentA.add(1, "Ben");
		System.out.format("Added Ben at front: %s%n",apartmentA.toString());
		
		// Replace an element.
		apartmentA.set(0,"Amy");
		System.out.format("Alice out Amy in: %s%n",apartmentA.toString());
		

	}
}

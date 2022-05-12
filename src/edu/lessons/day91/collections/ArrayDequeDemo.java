package edu.lessons.day91.collections;

import java.util.Iterator;
import java.util.ArrayDeque;
public class ArrayDequeDemo {
	public static void main(String args[]) {
		
		ArrayDeque<String> arraydeque = new ArrayDeque<String>();
		// Use an ArrayDeque like a stack.
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");//duplicate value
		arraydeque.push("Z");//duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
		
//		System.out.println("Before Popping the stack: "+arraydeque.size());
//		while(arraydeque.peek() != null)
//			System.out.print(arraydeque.pop() + " ");
//		
//		System.out.println(" After Popping the stack: "+arraydeque.size());
		Iterator<String> iterator = arraydeque.iterator();
	    while(iterator.hasNext()) {
	      System.out.println("\t"+iterator.next());
	    }
	    
	    Iterator<String> striterator = arraydeque.descendingIterator();
	    while(striterator.hasNext()) 
	    {
	      System.out.println("\t"+striterator.next());
	    }
	    arraydeque.addFirst("H");
	    arraydeque.addLast("I");
	    iterator = arraydeque.iterator();
	    while(iterator.hasNext()) {
	      System.out.println("\t"+iterator.next());
	    }
	    //---
	    //PollFirst - 
	    //Retrieves and removes the first element of this deque, or
	    //returns null if this deque is empty
	    System.out.println("************pollFirst: "+arraydeque.pollFirst());
	    System.out.println(arraydeque);
	    System.out.println("************pollLast: "+arraydeque.pollLast());
	    System.out.println(arraydeque);
	    //---
	    //peekFirst
	    //Retrieves, but does not remove, the first element of this deque, or 
	    //returns null if this deque is empty.
	    System.out.println("************peekFirst: "+arraydeque.peekFirst());
	    System.out.println(arraydeque);
	    System.out.println("************peekLast: "+arraydeque.peekLast());
	    System.out.println(arraydeque);
	    //---
	    //removeFirst
	    //Retrieves and removes the first element of this deque. 
	    //This method differs from pollFirst only in that it throws an exception 
	    //if this deque is empty.
	    System.out.println("************removeFirst: "+arraydeque.removeFirst());
	    System.out.println(arraydeque);
	    System.out.println("************removeLast: "+arraydeque.removeLast());
	    System.out.println(arraydeque);
	    //---
	    System.out.println("*removeFirstOccurrence: X "+arraydeque.removeFirstOccurrence("X"));
	    System.out.println(arraydeque);
	    System.out.println("*removeLastOccurrence: Z "+arraydeque.removeLastOccurrence("Z"));
	    System.out.println(arraydeque);
	    //offerFirst
	    //Inserts the specified element at the front of this deques
	    /*
	     * The difference is what happens when the addition fails, 
	     * due to a queue capacity restriction:
			.addFirst() throws an (unchecked) exception,
			.offerFirst() returns false.
		   ArrayDeque has no capacity restrictions, 
		   so basically .addFirst() will never throw an exception
		    (and .offerFirst() will always return true); 
		    this is unlike, for instance, 
		    a LinkedBlockingQueue built with an initial capacity.
	     */
	    System.out.println("************offerFirst: J");
	    arraydeque.offerFirst("J");
	    System.out.println(arraydeque);
	    System.out.println("************offerLast: K");
	    arraydeque.offerLast("K");
	    System.out.println(arraydeque);
	}
}
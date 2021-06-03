/*
 * DUE DATE FOR THIS HOMEWORK IS FRIDAY 13 AUGUST 2021
 * =================================================
 * Implement the ADTs we have learned (queue, singly linked list) using arrays.
 * An example for STACK is attached to this online homework for your reference.
 * You do not need to write code in order to create multiple ADTs,
 * like we did for the linked-based structures we wrote in class.
 * The point of this homework is to practice arrays and ADTs.
 * Remember to check your Advaced CS textbook for help!
 * You may want to submit your code in a zip file.
 * 
 * Abstract Data Types Example:
 * STACK, implemented using an array
 * 
 */

public class StackArray
{
	// constant (max. size of the stack)
	public static final int MAXSIZE = 5;
	// ----------------------------------------------------------
	// GLOBAL VARIABLES - this is our stack. SIZE is the top &  +
	public static int top = 0; // 0 is the bottom of the stack  +
	public static int[] stack = new int[MAXSIZE]; // stack<-ints+
	// ----------------------------------------------------------
	
	public static boolean isEmpty()
	{
		return top == 0;
	}
	
	public static boolean isFull()
	{
		return top == MAXSIZE;
	}
	
	public static void push(int n)
	{
		if( !isFull() )
		{
			stack[top] = n;
			top++;
		} else {
			System.out.println(n + " cannot be pushed. Stack overflow");
		}
	}

	public static int pop()
	{
		int pop = 0;
		if( !isEmpty() )
		{
			top--;
			pop = stack[top];
		} else {
			System.out.println("Stack empty. Cannot pop");
		}
		return pop;
	}

	public static int peek()
	{
		if( !isEmpty() )
		{
			return stack[top-1];
		} else {
			System.out.println("Stack empty. Cannot peek");
			return 0; // we have to return an int
		} 
	}
	
	public static void printStack()
	{
		System.out.print("TOP");
		if( isEmpty() )
		{
			System.out.println(" -> NULL"); // just to show that the stack is empty
			return;
		}
		for(int i = top-1; i >= 0; i--)
		{
			System.out.print(" -> " + stack[i]);
		}
		System.out.println();
	}

	// For testing purposes
	public static void main (String[] args)
	{
		System.out.println("\nStack maximum size: " + MAXSIZE);
		System.out.println( "push(5)" );	push(5);
		System.out.println( "pop(): " + pop() );
		for(int i = 0; i < 6; i++)
		{
			int n = 2*(i+1);
			System.out.printf( "push(%d) : ", n );
			push(n);
			printStack();
		}
		for(int i = 0; i < 6; i++)
		{
			System.out.println( "Popping: " + pop() );
			printStack();
		}
	}
}


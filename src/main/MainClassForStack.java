package main;

import ListTypes.Stack;

public class MainClassForStack<T> extends Stack<T>{

	public static void main(String[] args) {
	MainClassForStack<String> stack = new MainClassForStack<>();
	
	// empty()
	
	System.out.println("empty() : ");
	System.out.println(stack.empty());
	System.out.println();
	
	// push()
	
	System.out.println("push() : ");
	stack.push("a");
	stack.push("b");
	stack.push("c");
	stack.push("d");
	System.out.println(stack);
	System.out.println();
	
	// pop()
	
	System.out.println("pop() : ");
	stack.pop();
	System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack);
	System.out.println();
	
	// peek()
	
	System.out.println("peek() : ");
	System.out.println(stack.peek());
	System.out.println(stack);
	System.out.println();
	
	// search(element)
	
	System.out.println("search(element) : ");
	System.out.println("search(b) : " + stack.search("b"));
	System.out.println();
	
	}
}

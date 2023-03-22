package main;

import ListTypes.CircularLinkedList;

public class MainClassForCircularLinkedList<T> extends CircularLinkedList<T>{

	public static void main(String[] args) {
		
		// CircularLinkedList
		
		System.out.println(" \nCircularLinkedList...................\n\n");
		
		MainClassForCircularLinkedList<Integer> circularLinkedList = new MainClassForCircularLinkedList<Integer>();
		
		// insertNode(value)
		
		System.out.println("insertNode(value) : ");
		circularLinkedList.insertNode(1);
		circularLinkedList.insertNode(2);
		circularLinkedList.insertNode(3);
		circularLinkedList.insertNode(4);
		circularLinkedList.insertNode(5);
		System.out.println(" Circular Linked List : " + circularLinkedList);
		System.out.println();
		
		// deleteNode(index)
		
		System.out.println("deleteNode(index) : ");
		int a = (int)circularLinkedList.deleteNode(2);
		System.out.println(" After removed index 2 : " + circularLinkedList);
		System.out.println();
		
		System.out.println("insertAtBeginning() : ");
		circularLinkedList.insertAtBeginning(25);
		System.out.println(" After insert 25 at beginning : " + circularLinkedList);
		System.out.println();
		
		System.out.println("deleteNodeValue(value) : ");
		int b = (int)circularLinkedList.deleteNodeValue(25);
		System.out.println(" After delete 25 : " + circularLinkedList);
		System.out.println();
			
	}

	}

package main;

import ListTypes.LinkedList;

public class MainClassForLinkedList {

	public static void main(String[] args) {
	// LinkedList.................................................
	
			System.out.println("\nLinkedList..................\n");
			LinkedList<String> linkedList = new LinkedList<>();
			System.out.println("add(value) : ");
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("c");
			System.out.println(linkedList);
			System.out.println();
			
			// add(index, value)
			
			System.out.println("add(index, value) : ");
			linkedList.add(1, "e");
			linkedList.add(3, "d");
			linkedList.add(5, "f");
			linkedList.add(4, "g");
			linkedList.add(2, "h");
			System.out.println(linkedList);
			System.out.println();
			
			// remove(index)
			
			System.out.println("remove(index) : ");
			linkedList.remove(2);
			linkedList.remove(0);
			linkedList.remove(6);
			linkedList.remove(4);
			System.out.print(" After remove values : " );
			System.out.println(linkedList);
			System.out.println();
			
			// remove(value)
			
			System.out.println("remove(value) : ");
			linkedList.remove("f");
			linkedList.remove("h");
			System.out.print(" After remove values : " );
			System.out.println(linkedList);
			System.out.println();
			
			// get(index)
			
			System.out.println("get(index) : ");
			System.out.println(" value of index 2 : " + linkedList.get(2));
			System.out.println(" value of index 4 : " + linkedList.get(4));
			System.out.println();
			
			// set(index, value)
			
			System.out.println("set(index, value) : ");
			linkedList.set(1, "r");
			linkedList.set(4, "v");
			linkedList.set(2, "z");
			System.out.print(" After set values : ");
			System.out.println(linkedList);
			System.out.println();
			
			// indexOf(value)
			
			System.out.println("indexOf(value) : ");
			System.out.println(" indexOf d : " + linkedList.indexOf("d"));
			System.out.println(" indexOf g : " + linkedList.indexOf("g"));
			System.out.println();
			
			// lastIndexOf(value)
			
			System.out.println("lastIndexOf(value) : ");
			System.out.println(" lastIndexOf c : " + linkedList.lastIndexOf("c"));
			System.out.println();
			
			// size()
			
			System.out.println("size() : ");
			System.out.print(" size() : " + linkedList.size());
			System.out.println();
			System.out.println();
			
			// contains(value)
			
			System.out.println("contains(value) : ");
			System.out.println(" List contains r : " + linkedList.contains("r"));
			System.out.println(" List contains m : " + linkedList.contains("m"));
			System.out.println();
}
}

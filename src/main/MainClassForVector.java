package main;

import ListTypes.Vector;

public class MainClassForVector<T> extends Vector<T>{

	public static void main(String[] args) {
		
		// Vector
		System.out.println(" \nVector...................\n\n");
		
		MainClassForVector<String> vector = new MainClassForVector<>();
		
		// isEmpty()
		
		System.out.println("isEmpty() : ");
		System.out.println(vector.isEmpty());
		System.out.println();
		
		// add(value)
		
		System.out.println("add(value) : ");
		vector.add("a");
		vector.add("b");
		vector.add("c");
		vector.add("d");
		vector.add("e");
		System.out.println(" vector : " + vector);
		System.out.println();
		
		// get(index)
		
		System.out.println("get(index) : ");
		System.out.println(" value of index 2 : " + vector.get(2));
		System.out.println(" value of index 3 : " + vector.get(3));
		System.out.println();
		
		// add(index, value)
		
		System.out.println("add(index, value) : ");
		vector.add(2, "c");
		vector.add(3, "e");
		System.out.println(vector);
		System.out.println();
		
		// contains()
		
		System.out.println("contains(value) : ");
		System.out.println(" Vector contains a : " + vector.contains("a"));
		System.out.println(" Vector contains n : " + vector.contains("n"));
		System.out.println();
		
		// firstElement()
		
		System.out.println("firstElement() : ");
		System.out.println(vector.firstElement());
		System.out.println();
		
		// lastElement()
		
		System.out.println("lastElement() : ");
		System.out.println(vector.lastElement());
		System.out.println();
		
		// indexOf(value)
		
		System.out.println("indexOf(value) : ");
		System.out.println(vector.indexOf("b"));
		System.out.println();
		
		// isEmpty()
		
		System.out.println("isEmpty() : ");
		System.out.println(vector.isEmpty());
		System.out.println();
		
		// lastIndexOf(value)
		
		System.out.println("lastIndexOf(value) : ");
		System.out.println(vector.lastIndexOf("c"));
		System.out.println();
		
		// remove(index)
		
		System.out.println("remove(index) : ");
		vector.remove(2);
		System.out.println(vector);
		System.out.println();
		
		// remove(value)
		
		System.out.println("remove(value) : ");
		vector.remove("e");
		System.out.println(vector);
		System.out.println();
		
		// set(index, value)
		
		System.out.println("set(index, value) : ");
		vector.set(2, "no");
		System.out.println(vector);
		System.out.println();
		
		// size()
		
		System.out.println("size() : ");
		System.out.println(vector.size());
	}

	
}

package main;
import java.util.Arrays;

import ListTypes.*;

public class MainClassForArrayList{

	public static void main(String[] args){
		
		// ArrayList
		System.out.println(" \nArrayList...................\n\n");
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// add(value)
		
		System.out.println("add(value) : ");
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		System.out.println(arrayList);
		System.out.println();
		
		// add(index, value)
		
		System.out.println("add(index, value) : ");
		arrayList.add(1, "e");
		arrayList.add(3, "f");
		arrayList.add(5, "g");
		arrayList.add(4, "h");
		arrayList.add(2, "h");
		arrayList.add(21, "No");
		System.out.println(arrayList);
		System.out.println();
		
		// remove(index)
		
		System.out.println("remove(index) : ");
		arrayList.remove(2);
		arrayList.remove(0);
		arrayList.remove(6);
		arrayList.remove(4);
		arrayList.remove(25);
		System.out.print(" After remove values : " );
		System.out.println(arrayList);
		System.out.println();
		
		// remove(value)
		
		System.out.println("remove(value) : ");
		arrayList.remove("d");
		arrayList.remove("f");
		System.out.print(" After remove values : " );
		System.out.println(arrayList);
		System.out.println();
		
		// get(index)
		
		System.out.println("get(index) : ");
		System.out.println(" value of index 2 : " + arrayList.get(2));
		arrayList.get(4);
		arrayList.get(32);
		System.out.println();
		
		// set(index, value)
		
		System.out.println("set(index, value) : ");
		arrayList.set(1, "y");
		arrayList.set(4, "x");
		arrayList.set(2, "z");
		arrayList.set(22, "No");
		System.out.print(" After set values : ");
		System.out.println(arrayList);
		System.out.println();
		
		// indexOf(value)
		
		System.out.println("indexOf(value) : ");
		System.out.println(" indexOf c : " + arrayList.indexOf("c"));
		System.out.println(" indexOf x : " + arrayList.indexOf("x"));
		System.out.println();
		
		// lastIndexOf(value)
		
		System.out.println("lastIndexOf(value) : ");
		System.out.println(" lastIndexOf h : " + arrayList.lastIndexOf("h"));
		System.out.println();
		
		// size()
		
		System.out.println("size() : ");
		System.out.print(" size() : " + arrayList.size());
		System.out.println();
		System.out.println();
		
		// contains(value)
		
		System.out.println("contains(value) : ");
		System.out.println(" List contains a : " + arrayList.contains("a"));
		System.out.println(" List contains m : " + arrayList.contains("m"));
		System.out.println();
	
}
}

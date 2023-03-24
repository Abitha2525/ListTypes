package ListTypes;

import java.util.Arrays;

public abstract class Vector<T> implements List<T>{

	private T[] vector = (T[]) new Object[0];
	private long size = 0;
	
	// add(value)
	
	public synchronized void add(T element) {
		
		T[] arr = (T[]) new Object[vector.length+1];
		for(int i = 0; i < vector.length; i++) {
			arr[i] = vector[i];
		}
		arr[arr.length-1] = element;
		vector = arr.clone();
		size += 1;
	}

	// add(index, value)
	
	public synchronized void add(int index, T element) {
		try {
		T[] arr;
		if(index > -1 && index < vector.length) {
			vector = Arrays.copyOf(vector, vector.length + 1); 
			arr = vector.clone();
		for(int i = 0; i < vector.length; i++) {
			if(i < index - 1) {
				vector[i] = arr[i];
			}
			else if(i == index - 1) {
				vector[i] = element;
			}
			else {
				vector[i] = arr[i-1];
			}
		}
		size += 1;
		}
		else {
			throw new CustomExceptions("Index Out Of Bound Exception");
		}
		}
		catch(CustomExceptions ex) {
			ex.getMessage();
		}
	}
	
	// contains(value)
	
	public synchronized boolean contains(T element) {
		for(int i = 0; i < vector.length; i++) {
			if(String.valueOf(vector[i]).equals(String.valueOf(element))) {
				return true;
			}
		}
		return false;
	}
	
	// firstElement()
	
	public synchronized T firstElement() {
		return vector[0];
	}
	
	// lastElement()
	
	public synchronized T lastElement() {
		return vector[vector.length-1];
	}
	
	// indexOf(value)
	
	public synchronized int indexOf(T element) {
		for(int i = 0; i < vector.length; i++) {
			if(String.valueOf(vector[i]).equals(String.valueOf(element))) {
				return i;
			}
		}
		return -1;
	}
	
	// isEmpty()
	
	public synchronized boolean isEmpty() {
		if(vector.length > 0) {
			return false;
		}
		return true;
	}
	
	// lastIndexOf(value)
	
	public synchronized int lastIndexOf(T element) {
		int index = -1;
		for(int i = 0; i < vector.length; i++) {
			if(String.valueOf(vector[i]).equals(String.valueOf(element))) {
				index = i;
			}
		}
		return index;
	}
	
	// remove(index)
	
	public synchronized void remove(int index) {
		try {
		T[] arr = (T[]) new Object[vector.length-1];
		if(index > -1 && index < vector.length) {
			for(int i = 0; i < vector.length; i++) {
				if(i < index) {
					arr[i] = vector[i];
				}
				else if(i > index) {
					arr[i-1] = vector[i];
				}
			}
			vector = arr.clone();
			size -= 1;
		}
		else {
			throw new CustomExceptions("Index Out Of Bound Exception");
		}
		}
		catch(CustomExceptions ex) {
			ex.getMessage();
		}
	}
	
	// remove(value)
	
	public synchronized void remove(T element) {
		int index = -1;
		for(int i = 0; i < vector.length; i++) {
			if(String.valueOf(vector[i]).equals(String.valueOf(element))) {
				index = i;
				remove(index);
				break;
			}
		}
	}
	
	// get(index)
	
	public synchronized T get(int index) {
		try {
		if(index < vector.length) {
			return vector[index];
		}
		else {
			throw new CustomExceptions("Index Out Of Bound Exception");
		}
		}
		catch(CustomExceptions ex) {
			ex.getMessage();
		}
		return null;
	}
	
	// set(index, value)
	
	public synchronized void set(int index, T element) {
		try {
		if(index > -1 && index < vector.length) {
		for(int i = 0; i < vector.length; i++) {
			if(i == index) {
				vector[i] = element;
			}
		}
		}
		else {
			throw new CustomExceptions("Index Out Of Bound Exception");
		}
		}
		catch(CustomExceptions ex) {
			ex.getMessage();
		}
	}
	
	// size()
	
	public synchronized int size() {
		return (int)size;
	}
	
	// toString()
	
	public synchronized String toString() {
		StringBuffer string = new StringBuffer();
		
		for(int i = 0; i < vector.length-1; i++) {
			string = string.append(vector[i]).append(", ");
		}
		string = string.append(vector[vector.length-1]);
		return string.toString();
	}
}

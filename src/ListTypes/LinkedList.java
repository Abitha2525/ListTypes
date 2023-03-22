package ListTypes;

import java.util.Arrays;

public class LinkedList<T> implements List<T> {

	public  T[] linkedList;
	long size = 0;
	
	public LinkedList() {
		linkedList = (T[]) new Object[10];
	}
	
	//add(value)
	
	public void add(T value) {
		linkedList = Arrays.copyOf(linkedList, (int)(size+1));
		linkedList[(int)size] = value; 
		size += 1;
	}
	
	//add(index, value)
	
	public void add(int index, T value) {
		try {
		T[] arr;
		if(index < linkedList.length) {
			linkedList = Arrays.copyOf(linkedList, linkedList.length + 1);
			arr = linkedList.clone();
			for(int i = 0; i < linkedList.length; i++) {
				if(i < index-1){
					linkedList[i] = arr[i];
				}
				else if(i == index-1) {
					linkedList[i] = value;
				}
				else {
					linkedList[i] = arr[i-1];
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
	
	//remove(index)
	
	public void remove(int index) {
		try {
		T[] arr = (T[]) new Object[linkedList.length - 1];
		if(index < linkedList.length && index > -1) {
			for(int i = 0; i < linkedList.length; i++) {
				if(i < index) {
					arr[i] = linkedList[i];
				}
				else if(i > index) {
					arr[i-1] = linkedList[i];
				}
			}
			linkedList = arr.clone();
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
	
		public void remove(T value) {
			int index = -1;
			for(int i = 0; i < linkedList.length; i++) {
				if(String.valueOf(linkedList[i]).equals(String.valueOf(value))) {
					index = i;
					remove(index);
					break;
				}
			}
		}
	
	//get(index)
	
	public T get(int index) {
		try {
		if(index < linkedList.length && index > -1) {
		for(int i = 0; i < linkedList.length; i++) {
			if(i == index) {
				return linkedList[i];
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
		return null;
	}
	
	
	// set(index, value)
	
	public void set(int index, T value) {
		for(int i = 0; i < linkedList.length; i++) {
			if(i == index) {
				linkedList[i] = value;
			}
		}
	}
	
	// indexOf(value)
	
    public int indexOf(T value) {
    	for(int i = 0; i < linkedList.length; i++) {
    		if(linkedList[i].equals(value)) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    // lastIndexOf(value)
    
    public int lastIndexOf(T value) {
    	int temp = -1;
    	for(int i = 0; i < linkedList.length; i++) {
    		if(linkedList[i].equals(value)) {
    			temp = i;
    		}
    	}
    	return temp;
    }
    
    // size()
    
    public int size() {
    	return (int)size;
    }
	
    // contains()
    
    public boolean contains(T element) {
		for(int i = 0; i < linkedList.length; i++) {
			if(String.valueOf(linkedList[i]).equals(String.valueOf(element))) {
				return true;
			}
		}
		return false;
	}
    
    // toString()
    
    public String toString() {
        StringBuffer string = new StringBuffer();
		
		for(int i = 0; i < linkedList.length-1; i++) {
			string = string.append(linkedList[i]).append(", ");
		}
		string = string.append(linkedList[linkedList.length-1]);
		return string.toString();
    }
}

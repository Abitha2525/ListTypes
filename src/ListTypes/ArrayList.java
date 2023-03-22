package ListTypes;

import java.util.Arrays;

public class ArrayList<T> implements List<T>{

	public  T[] arrayList;
	long size = 0;
	
	public ArrayList() {
		arrayList = (T[]) new Object[10];
	}
	
	//add(value)
	
	public void add(T value) {
		arrayList = Arrays.copyOf(arrayList, (int)(size+1));
		arrayList[(int)size] = value; 
		size += 1;
	}
	
	//add(index, value)
	
	public void add(int index, T value) {
		
		try {
		T[] arr;
		if(index > -1 && index < arrayList.length) {
			arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);
			arr = arrayList.clone();
			for(int i = 0; i < arrayList.length; i++) {
				if(i < index-1){
					arrayList[i] = arr[i];
				}
				else if(i == index-1) {
					arrayList[i] = value;
				}
				else {
					arrayList[i] = arr[i-1];
				}
			}
			size += 1;
		}
		else {
			throw new CustomExceptions("Index Out Of Bound Exception for index " + index);
		}
		}
		catch(CustomExceptions ex) {
			ex.printStackTrace();
		}
	}
	
	//remove(index)
	
	public void remove(int index) {
		try {
		T[] arr = (T[]) new Object[arrayList.length - 1];
		if(index < arrayList.length && index > -1) {
			for(int i = 0; i < arrayList.length; i++) {
				if(i < index) {
					arr[i] = arrayList[i];
				}
				else if(i > index) {
					arr[i-1] = arrayList[i];
				}
			}
			arrayList = arr.clone();
			size -= 1;
		}
		else {
				throw new CustomExceptions("Index Out Of Bound Exception for index " + index);
		}
		}
		catch(CustomExceptions ex) {
			ex.printStackTrace();
		}
		
	}
	
	// remove(value)
	
	public void remove(T value) {
		int index = -1;
		for(int i = 0; i < arrayList.length; i++) {
			if(String.valueOf(arrayList[i]).equals(String.valueOf(value))) {
				index = i;
				remove(index);
				break;
			}
		}
	}
	
	//get(index)
	
	public T get(int index) {
		try {
		if(index < arrayList.length && index > -1) {
		for(int i = 0; i < arrayList.length; i++) {
			if(i == index) {
				return arrayList[i];
			}
		}
		}
		else {
			throw new CustomExceptions("Index Out Of Bound Exception for index " + index);
		}
		}
		catch(CustomExceptions ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	
	// set(index, value)
	
	public void set(int index, T value) {
		try {
		if(index > -1 && index < arrayList.length) {
		for(int i = 0; i < arrayList.length; i++) {
			if(i == index) {
				arrayList[i] = value;
			}
		}
		}
		else {
			throw new CustomExceptions("Index Out Of Bound Exception for index " + index);
		}
		}
		catch(CustomExceptions ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	// indexOf(value)
	
    public int indexOf(T value) {
    	for(int i = 0; i < arrayList.length; i++) {
    		if(arrayList[i].equals(value)) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    // lastIndexOf(value)
    
    public int lastIndexOf(T value) {
    	int temp = -1;
    	for(int i = 0; i < arrayList.length; i++) {
    		if(arrayList[i].equals(value)) {
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
		for(int i = 0; i < arrayList.length; i++) {
			if(String.valueOf(arrayList[i]).equals(String.valueOf(element))) {
				return true;
			}
		}
		return false;
	}
    
    // toString()
	
    public String toString() {
        StringBuffer string = new StringBuffer();
		
		for(int i = 0; i < arrayList.length-1; i++) {
			string = string.append(arrayList[i]).append(", ");
		}
		string = string.append(arrayList[arrayList.length-1]);
		return string.toString();
    }
}

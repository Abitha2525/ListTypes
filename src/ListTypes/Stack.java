package ListTypes;

public abstract class Stack<T> extends Vector<T>{

	private T[] stack = (T[]) new Object[0];
	
	// empty()
	
	public boolean empty() {
		if(stack.length > 0) {
			return false;
		}
		return true;
	}
	
	// push()
	
	public void push(T element) {
		T[] arr = (T[]) new Object[stack.length+1];
		for(int i = 0; i < stack.length; i++) {
			arr[i] = stack[i];
		}
		arr[arr.length-1] = element;
		stack = arr.clone();
		size += 1;
	}
	
	// pop()
	
	public T pop() {
		T[] arr = (T[]) new Object[stack.length-1];
		for(int i = 0; i < stack.length-1; i++) {
			arr[i] = stack[i];
		}
		T ans = stack[stack.length-1];
		stack = arr.clone();
		size -= 1;
		return ans;
		
	}
	
	// peek()
	
	public T peek() {
		return stack[stack.length-1];
	}
	
	// search(element) 
	
	public int search(T element) {
		for(int i = 0; i < stack.length; i++) {
			if(String.valueOf(stack[i]).equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	// toString()
	
	public String toString() {
		StringBuffer string = new StringBuffer();
		
		for(int i = 0; i < stack.length-1; i++) {
			string = string.append(stack[i]).append(", ");
		}
		string = string.append(stack[stack.length-1]);
		return string.toString();
	}
}

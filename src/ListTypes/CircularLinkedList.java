package ListTypes;

public abstract class CircularLinkedList<T> implements List{
	private int lengthOfLinkedList = 0;
	private Node head;
	
	public void insertNode(T value) {
		lengthOfLinkedList += 1;
		Node node = new Node(value, null);
		if(head == null) {
			head = node;
			node.nextNode = head;
		}
		else {
			Node currentNode = head;
			while(!currentNode.nextNode.equals(head)) {
				currentNode = currentNode.nextNode;
			}
			node.nextNode = head;
			currentNode.nextNode = node;
		}
	}
	
	public void insertAtBeginning(T value) {
		lengthOfLinkedList += 1;
	    Node node = new Node(value, null);
	    if(head == null) {
	    	head = node;
	    	node.nextNode = head;
	    }
	    else {
	    	Node temp = new Node(head.data, head.nextNode);
	    	Node currentNode = head;
	    	while(!currentNode.nextNode.equals(head)) {
	    		currentNode = currentNode.nextNode;
	    	}
	    	head = node;
	    	head.nextNode = temp;
	    	currentNode.nextNode = head;
	    }
	}
	
	public T deleteNode(int index) {
		try {
		Node currentNode = head;
		Node previousNode = null;
		
		if(index == 0) {
			T ans = (T)head.data;
			while(!currentNode.nextNode.equals(head)) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = currentNode.nextNode.nextNode;
			head = currentNode.nextNode;
			return ans;
			
		}
		
		else if(index < 0) {
			throw new CustomExceptions("Index Out Of Bound Exception");
		}
		else {
			for(int i = 0; i < index; i++) {
				if(currentNode != null && !currentNode.nextNode.equals(head)) {
					previousNode = currentNode;
					currentNode = currentNode.nextNode;
				}
				else {
					throw new CustomExceptions("Index Out Of Bound Exception");
				}
			}
			Node nodeToConnect = currentNode.nextNode;
			previousNode.nextNode = nodeToConnect;
			currentNode.nextNode = null;
			lengthOfLinkedList -= 1;
			return (T) currentNode.data;
		}
		}
		catch(CustomExceptions ex) {
			ex.getMessage();
		}
		return null;
	}
	
	public int SearchElement(T element) {
		Node currentNode = head;
		int index = -1;
		for(int i = 0; i < lengthOfLinkedList; i++) {
			if(currentNode.toString().equals(String.valueOf(element))) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public T deleteNodeValue(T value) {
		return deleteNode(SearchElement(value));
	}

	public String toString() {
		StringBuffer string = new StringBuffer();
		Node currentNode = head;
		while(!currentNode.nextNode.equals(head)) {
			string = string.append(currentNode.data).append(", ");
			currentNode = currentNode.nextNode;
		}
		string = string.append(currentNode.data);
		return string.toString();
	}
	
	
	@Override
	public void add(Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indexOf(Object value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Object value) {
		// TODO Auto-generated method stub
		return false;
	}
}


class Node<T>{
	T data;
	Node nextNode;
	
	Node(T data, Node nextNode){
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public String toString() {
		return String.valueOf(data);
	}
}


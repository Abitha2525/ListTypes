package ListTypes;

public interface List<T> {

	 public void add(T value);
     public void add(int index, T value);
     public void remove(int index);
     public void remove(T element);
     public T get(int index);
     public void set(int index, T value);
     public int indexOf(T value);
     public int lastIndexOf(T value);
     public int size();
     public boolean contains(T value);
	
}
package pkg1;

import java.util.Arrays;

public class ObjectList<E> {
	private int size = 0;
	private final int initial_capacity = 20;
	private Object elements[];
	
	public ObjectList() {
		elements = new Object[initial_capacity];
	}
	
	public void add(E e) {
		if (size == elements.length) increaseCapacity();
		elements[size++] = e;
	}

	private void increaseCapacity() {
		int newSize = elements.length*2;
		elements = Arrays.copyOf(elements, newSize);
	}
	private void set(int n,E e) {
		elements[n] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int i) {
		if( i >= size || i < 0) {
			System.out.println("index out of Bounds");
			throw new IndexOutOfBoundsException("");
		}
		return (E) elements[i];
	}
	
	public void IntSort() {
		
			E Temp;
			for (int i=0;i<size-1;++i){

	            for(int j=0;j<size-i-1; ++j){

	                if( (Integer) get(j+1) < (Integer) get(j)){

	                    Temp = get(j);
	                    set(j, get(j+1));
	                    set(j+1, Temp);

	                }
	            }
	        }
		
	}
}

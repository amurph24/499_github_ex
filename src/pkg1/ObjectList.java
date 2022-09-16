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
	
	@SuppressWarnings("unchecked")
	public E get(int i) {
		if( i >= size || i < 0) {
			System.out.println("index out of Bounds");
			throw new IndexOutOfBoundsException("");
		}
		return (E) elements[i];
	}
}

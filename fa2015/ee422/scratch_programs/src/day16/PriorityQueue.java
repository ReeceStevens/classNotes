package day16;

public class PriorityQueue<E extends Comparable<E>> {
	private E[] container;
	private int size;

	public PriorityQueue () {
		container = getArray(2);
	}	

	private E[] getArray (int conSize) {
		return (E[])(new Comparable[conSize]);
	}

	public void enqueue(E val) {
		if (size >= container.length - 1) {
			enlargeArray(container.length*2 + 1);
		}
		size++;
		int indexToPlace = size;
		while ((indexToPlace > 1) && (val.compareTo(container[indexToPlace/2])<0)) {
			container[indexToPlace] = container[indexToPlace/2]; // Swap step
			indexToPlace /= 2;
		}
		container[indexToPlace] = val;

	}

	public void enlargeArray(int newSize) {
		E[] temp  = getArray(newSize);
		System.arraycopy(container,1,temp,1,size);	
		container = temp;
	}

}

package day14generics;

import java.util.*;

public class GenericArray <E extends Comparable<E>> implements Iterable<E> {
	int index;
	int length;
	//@SuppressWarnings("unchecked");
	E [] data = (E[])(new Object[10]);

	public void append (E value) {
		if (data.length == length) {
			E[] old_data = data;
			data = (E[])(new Object[length*2]);
			for (int k = 0; k < length; k += 1) {
				data[k] = old_data[k];
			}
		}
		data[length] = value;
		length ++;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	public String toString() {
		return Arrays.toString(data);
	}

	public boolean isFirstMax() {
		 return data[0].compareTo(data[1]) > 0;
	}
}

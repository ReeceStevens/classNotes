package generics;

import java.util.Collection;
import java.util.Iterator;

public class GenericWild {
	public static void main (String [] args) {

	}

	// Generic <?> enforces that it is a collection
	// of only one type-- we just don't know what type yet.
	void printCollection (Collection<?> c){
		for (Object e: c) {
			System.out.println(e);
		}
	}

	static <T> void fromArrayToCollection (T[] a, Collection<T> c) {
		for (T e : a) {
			c.add(e);
		}	
	}
}

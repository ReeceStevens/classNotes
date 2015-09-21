import java.util.*;

public class day7 {
	public static void main(String [] args) {
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(3);
		intSet.add(2);
		intSet.add(3);
		System.out.println(intSet);

		Set<Integer> intTreeSet = new TreeSet<Integer>();
		intTreeSet.add(5);
		// Integer b = intTreeSet.first(); This won't work because intTreeSet is just a set!
		// first() is only for treesets, so you have to typecast before calling first().
	}
}

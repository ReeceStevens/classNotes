package day9;

public class ArrayIterator {
	private int position = 0;
	private Array list;

	public boolean hasNext() {
		return position < list.size();	
	}
}

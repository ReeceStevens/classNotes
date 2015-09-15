package project2class;

public class LinkedList implements Sequence {
	private Node front = null; 
	private int length = 0;

	private static class Node {
		Object val;
		Node next;
		Node prev;

		public Node (Object val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}

		public Object get() {
			return this.value;
		}

		public Node successor() {
			return this.next;
		}
	}

	int size(){
		return 0;		
	}; 
	void append(Object value)
	void truncate(); 
	void truncate(int new_length);	Object[] toArray();
	Object get(int index); // returns the object at this index position
	void set(int index, Object new_value); // replaces the value stored at this index to be new_value
	
	public Position head(){
		return start;	   
	}	// returns the first position in the Sequence (i.e., the position with index 0)
	public Position tail(){
		 
	}	// returns the last position in the Sequence (i.e., the position with index size() - 1)
	
	boolean isValid(Position pos); // returns true if pos is a valid position in the sequence
	public Position after(Position pos){
		return pos.successor();
		//return ((Node)pos).next;	
	}
	Position before(Position pos); // returns the position immediately prior to pos, must be O(1) time complexity for all implementations of Sequence
	
	
	public Object get(Position pos){
		return pos.get();
	}

	void set(Position pos, Object new_value); // replaces the values stored at this index to be new value -- must be O(1)
	
	Position getPosition(int index); // returns the position for this index
	
	Position find(Object value);  
	
	void insertAt(Position pos, Object value); // inserts a new object into the sequence
	    /* if pos is the head of the sequence, then the new value that is inserted becomes the new head (and all
	    * values are shifted one to the right).
	    * Stated concisely: Insert value immediately before position pos in the sequence.
	    * Must be O(1) time complexity for linked list implementations 
	    */
	
	void removeAt(Position pos); // removes an object from the sequence
}

package project2class;

public interface Sequence {
/* Basic Ops */
	int size(); // returns the number of values stored in the sequence
	void append(Object value);
	void truncate(); // removes the last element
	void truncate(int new_length); // removes all elements at positions k where k >= new_length
	Object[] toArray();
	Object get(int index); // returns the object at this index position
	void set(int index, Object new_value); // replaces the value stored at this index to be new_value
	
/* Advanced Ops */
	/* in the methods below, Position is an interface of your design
	 * The purpose of Position is to uniquely identify one of the positions in a Sequence, but 
	 * (unlike an integer index) to permit fast access to that position even for Sequences implemented
	 * using links (i.e., a linked list). 
	 * Some positions may be "invalid" (e.g., out of bounds in the Sequence). Note that we have a method
	 * that can be used to check a position to ensure it is valid before it is used. 
	 * If a client program uses an invalid Position for any method (other than calling isValid), then
	 * undefined behavior results */
	
	Position head(); // returns the first position in the Sequence (i.e., the position with index 0)
	Position tail(); // returns the last position in the Sequence (i.e., the position with index size() - 1)
	
	boolean isValid(Position pos); // returns true if pos is a valid position in the sequence
	Position after(Position pos); // returns the position immediately after pos, must be O(1) time complexity for all implementations of Sequence
	Position before(Position pos); // returns the position immediately prior to pos, must be O(1) time complexity for all implementations of Sequence
	
	
	Object get(Position pos); // returns the object at this position, must be O(1) time complexity for all implementations of Sequence
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
	   /* Remove the value located at Position pos.
	    * After the object is removed, all objects to the right of pos are effectively shifted one to the left
	    * Must be O(1) time complexity for linked list implementations 
	    */
	

}

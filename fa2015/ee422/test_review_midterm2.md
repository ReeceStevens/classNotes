Test Review -- midterm 2
===========

- JUnit (crap, gotta learn that)
- Generics
- Hash Table
- Red/Black trees
- Anything in assignments 4 or 5

Check out the practiceit website for good practice problems
HeapIntPriorityQueue

topics to know
==
- Hashset (def know this)
- Trees
	- BST
	- Red-black
	- traversal
	- insert/delete
	- write from scratch
- Heaps
	- Min/max heaps
- Stacks
	-  know how to push/pop (LIFO)
- Queues
	- know how it operates/ how polling works (FIFO)
- Maps
	- key to value
	- probably just going to be reading code, not writing it

Heap example 
--
max tree: root is larger than children

			90
		  /    \
	     45		20
		/  \   /  \
	  30   10 5	  15
	 /
	4

In the computer, you store these values as an array
	start at index 1
	fill in array top to bottom, left to right

	X  90  45  20  30  10  5  15  4
	0	1	2	3	4	5  6   7  8	
	if a parent is index i, children are at index 2i and 2i+1	

	To insert 50, place it at the next available location (next to 4) and then bubble up
		Check if 50 is greater than its parent. if so, swap with the parent. Continue until 50 is less than its parent.

			90
		  /    \
	     50		20
		/  \   /  \
	  45   10 5	  15
	 /  \
	4   30

	Delete 90 (it's the only element you can guarantee the position of, property of max heap)
		Move the last value (now 30) to the root. Check max heap conditions, swap if child is greater than root. Continue until
		everything is back to normal.

			50
		  /    \
	     45		20
		/  \   /  \
	  30   10 5	  15
	 /  
	4 

Stack example
--

Stack<chars> stack = new Stack<>();
// Goal: given a string "([]){}", make sure all brackets and parentheses are matched
for (int i = 0; i < s.length(); i += 1) {
	if (s.charAt(i) == '(') s.push('(');
	if (s.charAt(i) == '[') s.push('[');
	if (s.charAt(i) == '{') s.push('{');
	if (s.charAt(i) == ')') {
		if(stack.isEmpty()){
			return false;
		}	
		if (stack.pop() != '(') { return false; }
	} 
	if (s.charAt(i) == ']') s.push(']');
	if (s.charAt(i) == '}') s.push('}');	
}
return stack.isEmpty();

Map example
--

// Given a map, this changes the map by swapping keys and values that are not alphabetical (key, then value in alphabetical order)
public static void mapMystery(Map<String,String> map){
	Map<String, String> result = new TreeMap<String,String>();
	for (String key: map.keySet()){
		if (key.compareTo(map.get(key)) < 0) {
			result.put(key,map.get(key));
		} else {
			result.put(map.get(key), key);
		}
	}
	System.out.println(result);
}

Queue example
--

		1
	  /   \
	2	   3
  /  \    / \
 4   5   6   7
	
 	Queue<Nodes> q  = new LinkedList<Node>();
	q.add(root);
	while(!q.isEmpty()) {
		Node temp = z.poll();
		// print out data here
		if (temp.left != null) { q.add(temp.left); }
		if (temp.right != null) { q.add(temp.right); }
	}	



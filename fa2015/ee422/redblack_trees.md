Red Black Trees
==
Height in a BST = number of EDGES, not elements.

In a normal BST
	Insertion: O(logN)
	Deletion: O(logN)
	Access: O(logN)
	

Each node indicated as red or black
	Path: a unique series  of links traverses from the root to each node
	Path length: number of edges from the node to the root
	in Red Black grees, paths from the root with 1 or 0 edges are important

Every node is R or B
	root is B
	R nodes must have all B children
	Every path from a node to a null link must contain the same number of black nodes
If a red node has any children, it must have two children and they must be black.
If a black node has only one child, it must be a red leaf.

Red/Black trees have a maximum height based on their rules
Red/Black tree properties
	Insertion
	Must maintain rules of red/black tree
	New node is always a leaf
		can't be black or we will violate rule 4
		new leaf mmust be red
		If parent is black, we're done (trivial case)
		If parent is red, things get interesting because a red leaf with a red parent violates rule 3



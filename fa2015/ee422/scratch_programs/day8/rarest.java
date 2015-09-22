public class rarest {
	/*
	 Go through each of the values in the input map and 
	 add it as a key to another map, tallies.

	 If key already exists, increment the value for that key.
	 If not, create the key with value = 1.

	 Get the lowest frequency by sorting the set of all frequencies (tallies.values())a
	 Go through tallies' keys, looking for the lowest frequency.
	 End search when found and return key.
	*/
	public static int rarest(Map<String, Integer> m) {
		if (m.size() == 0) { throw new IllegalArgumentException(); }
		Collection<Integer> vals = m.values();
		TreeMap<Integer, Integer> tallies = new TreeMap<Integer, Integer>();	
		for (int value: vals) {
			if (tallies.containsKey(value)) {
				// Increment value for each new occurrance of the value
				int count = tallies.get(value);
				tallies.put(value, count+1);
			} else {
				tallies.put(value, 1);
			}
		}

		// TreeSet is sorted from minimum to maximum
		TreeSet<Integer> counts = new TreeSet<Integer>(tallies.values());
		int lowestCount = counts.first();
		for (int key: tallies.keySet()) {
			// I think this is pseudocode....
			if(tallies.get(key) == lowestCount) {
				return key;
			}	
		}
		return 0;
	}	
	
	
}

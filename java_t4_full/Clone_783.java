public static int mode (int [] [] arr) {
    List < Integer > list = new ArrayList < Integer > ();
    for (int i = 0;
    i < arr.length; i ++) {
        for (int j = 0;
        j < arr [i].length; j ++) {
            list.add (arr [i] [j]);
        }
    }
    int [] vector = new int [list.size ()];
    for (int i = 0;
    i < vector.length; i ++) {
        vector [i] = list.get (i);
    }
}


 public static int mode(int[][] arr) {
		
	// create a map to store counts for each element
        Map<Integer, Integer> counts = new HashMap<>();
	
	// loop through each row and each column
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
		
		// check if map contains the element
                if (counts.containsKey(arr[i][j])) {
			
			// if yes increment the count by one
                    counts.put(arr[i][j], counts.get(arr[i][j]) + 1);
                } else {
			
			// if not add the element to map with count as one
                    counts.put(arr[i][j], 1);
                }
            }
        }
	
	// initializing highest frequency and mode as 0
        int highestFrequency = 0;
        int mode = 0;
	
	// looping over the map
        for (int num : counts.keySet()) {
		
		// set current count
            int count = counts.get(num);
		
		// if the frequency is greater than highest frequency,
		// set highest frequency equals to the current count and
		// set the mode equals to current number
            if (count > highestFrequency) {
                mode = num;
                highestFrequency = count;
            }
        }
        // return the mode
        return mode;
}


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
	// create a list 
    List<Integer> list = new ArrayList<>();
    // loop through each row and each column 
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
         	// add the element to list 
            list.add(arr[i][j]);
        }
    }
    
	// create a map to store each element as key and its count as value 
    Map<Integer, Integer> counts = new HashMap<>();
    for (Integer value : list) {
        if (counts.containsKey(value)) {
        // if element is present in map increase its count
            counts.put(value, counts.get(value) + 1);
        } else {
        // otherwise set the count to one
            counts.put(value, 1);
        }
    }
	// initialising highest frequency and mode as 0 
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



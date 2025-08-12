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
    List<Integer> list = new ArrayList<>();
    // loop through each row and each column 
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
        	// add the element to list 
            list.add(arr[i][j]);
        }
    }
	// make a new integer array to store count of each element
    int[] counts = new int[list.size()];
	// initialise the variable to store frequency of most frequent element and variable to store  most frequent element
    int mostFrequent = 0;
    int mode = 0;
    int highestFrequency = 0;
	// traverse the list
    for(int i=0; i<list.size(); i++){
		// get the index of the element
        mostFrequent = list.indexOf(list.get(i));
        counts[mostFrequent]++;
		// compare count and highest frequency if count is greater than highest frequency
		// set higher frequency as count and set mode equals to current element 
        if(counts[mostFrequent] > highestFrequency){
            highestFrequency = counts[mostFrequent];
            mode = list.get(i);
        }
    }
	// return the mode
    return mode;
}



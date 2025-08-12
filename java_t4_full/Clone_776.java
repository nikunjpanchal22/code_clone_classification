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


 
 public static int mode (int [][] arr){
	//Create an ArrayList 
	List<Integer> list = new ArrayList<>();
	// Traverse the 2D array 
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			// Add elements of the 2D array to the list 
			list.add(arr[i][j]);
		}
	}
	// Make an integer array to store the list elements 
	int[] vector = new int[list.size()];
	for (int i = 0; i < vector.length; i++) {
		vector[i] = list.get(i);
	}
	// Make an integer array to store frequency of each element 
	int[] counts = new int[vector.length];
	// Initialise the mode element to 0 
	int mode = 0;
	// Iterate through the vector array 
	for (int i = 0; i < vector.length; i++) {
		int count = 0;
		// Count the frequency of each element by comparing elements of the vector array 
		for (int j = 0; j < vector.length; j++) {
			if (vector[i] == vector[j]) {
				count++;
				counts[i] = count;
			}
		}
		// Find the mode by comparing the count of each element with the mode 
		if (count > mode) {
			mode = vector[i];
		}
	}
	return mode;
}



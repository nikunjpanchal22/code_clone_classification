static int [] sort (int arr []) {
    for (int i = 0;
    i < arr.length; i ++) {
        for (int j = i;
        j < arr.length; j ++) {
            if (arr [j] < arr [i]) {
                int temp = arr [i];
                arr [i] = arr [j];
                arr [j] = temp;
            }
        }
    }
    return arr;
}



static int [] sort (int arr []) {
	    int n = arr.length; 
	    int max = getMax (arr, n); 
	    for (int exp = 1; max / exp > 0; exp *= 10) 
		countSort (arr, n, exp);
	    return arr;
	}
	  
	private static void countSort (int [] arr, int n, int exp) {
	    int output [] = new int [n]; 
	    int count [] = new int [10]; 
	    Arrays.fill (count, 0); 
	    for (int i = 0; i < n; i ++) {
		count [(arr [i] / exp) % 10] ++;
	    }
	    for (int i = 1; i < 10; i ++) {
		count [i] += count [i - 1];
	    }
	    for (int i = n - 1; i >= 0; i --) {
		output [count [ (arr [i] / exp) % 10] - 1] = arr [i]; 
		count [(arr [i] / exp) % 10] --; 
	    }
	    for (int i = 0; i < n; i ++)
		arr [i] = output [i]; 
	}
	  
	private static int getMax (int [] arr, int n) {
	    int mx = arr [0]; 
	    for (int i = 1; i < n; i ++) {
		if (arr [i] > mx) 
		    mx = arr [i]; 
	    }
	    return mx; 
}



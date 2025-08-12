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
	    quickSort (arr, 0, arr.length - 1);
	    return arr;
	}

	private static void quickSort (int [] arr, int low, int high) {
	    int i = low;
	    int j = high; 
	    int pivot = arr [(high + low) / 2]; 
	    while (i <= j) {  
		while (arr [i] < pivot) {
		    i ++;
		} 
		while (arr [j] > pivot) {
		    j --;
		}
		if (i <= j) {  
		    int temp = arr [i];
		    arr [i] = arr [j];
		    arr [j] = temp;
		    i ++;
		    j --;
		}  
	    } 
	    if (low < j) 
		quickSort (arr, low, j);  
	    if (i < high) 
		quickSort (arr, i, high); 
} 



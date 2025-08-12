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
    for (int i = n / 2 - 1; i >= 0; i --) {
        heapify (arr, n, i);
    }
    for (int i = n - 1; i >= 0; i--) {
        int temp = arr [0];
        arr [0] = arr [i];
        arr [i] = temp;
        heapify (arr, i, 0);
    }
    return arr;
	}

	private static void heapify (int [] arr, int n, int i) {
	    int largest = i;
	    int l = 2 * i + 1;
	    int r = 2 * i + 2;
	    if (l < n && arr [l] > arr [largest]) {
		largest = l;
	    }
	    if (r < n && arr [r] > arr [largest]) {
		largest = r;
	    }
	    if (largest != i) {
		int temp = arr [i];
		arr [i] = arr [largest];
		arr [largest] = temp;
		heapify (arr, n, largest);
	    }
}



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
    if (arr.length > 1) {
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange (arr, 0, mid);
        int[] right = Arrays.copyOfRange (arr, mid, arr.length);
        sort (left);
        sort (right);
        merge (left, right, arr);
    }
    return arr;
	}

	private static void merge (int [] left, int [] right, int [] arr) {
	    int l = 0, r = 0, m = 0;
	    while (l < left.length && r < right.length) {
		if (left [l] < right [r]) {
		    arr [m] = left [l];
		    l ++;
		} else {
		    arr [m] = right [r];
		    r ++;
		}
		m ++;
	    }
	    while (l < left.length) {
		arr [m] = left [l];
		l ++;
		m ++;
	    }
	    while (r < right.length) {
		arr [m] = right [r];
		r ++;
		m ++;
	    }
}



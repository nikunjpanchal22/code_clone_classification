public static int binarySearch (int intToSearch, int [] sortedArray) {
    int lower = 0;
    int upper = sortedArray.length - 1;
    while (lower <= upper) {
        int mid = lower + (upper - lower) / 2;
        if (intToSearch < sortedArray [mid]) upper = mid - 1;
        else if (intToSearch > sortedArray [mid]) lower = mid + 1;
        else return mid;
    }
    return - 1;
}


 public static int binarySearch(int intToSearch, int [] sortedArray) {
	int low = 0;
	int high = sortedArray.length - 1;
	
	while(low <= high) {
		int middle = (low + high) / 2;
		
		if (intToSearch < sortedArray[middle]) {
			high = middle - 1;	
		} else if (intToSearch > sortedArray[middle]) { 
			low = middle + 1;
		} else {
			return middle;
		}
	}
	return -1;
}



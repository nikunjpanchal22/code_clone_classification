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


 public static  int binarySearch(int intToSearch, int[] sortedArray) {
    int start = 0;
    int end = sortedArray.length - 1;

    while (start <= end) {
        int midpoint = start + (end - start) / 2;

        if (sortedArray[midpoint] == intToSearch) {
            return midpoint;
        }

        if (sortedArray[midpoint] > intToSearch) {
            end = midpoint - 1;
        } else {
            start = midpoint + 1;
        }
    }
    return -1;
}



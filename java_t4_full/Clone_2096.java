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


 public static int binarySearch(int intToSearch, int[] sortedArray) {
    int lower = 0;
    int upper = sortedArray.length-1;

    while (lower <= upper) {
        int midPoint = lower + (upper - lower) / 2;

        if (intToSearch < sortedArray[midPoint]){
            upper = midPoint - 1;
        } else if (intToSearch > sortedArray[midPoint]){
            lower = midPoint + 1;
        } else {
            return midPoint;
        }
    }
    return -1;
}



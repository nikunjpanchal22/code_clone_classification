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


 public static int binarySearch (int intToSearch, int [] sortedArray) {
    int lowerLimit = 0;
    int upperLimit = sortedArray.length - 1;
    while (lowerLimit <= upperLimit) {
        int midIndex = lowerLimit + (upperLimit - lowerLimit) / 2;
        if (intToSearch < sortedArray [midIndex]) upperLimit = midIndex - 1;
        else if (intToSearch > sortedArray [midIndex]) lowerLimit = midIndex + 1;
        else return midIndex;
    }
    return -1;
}

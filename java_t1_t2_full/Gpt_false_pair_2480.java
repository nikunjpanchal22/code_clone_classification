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
    int lowerBound = 0;
    int upperBound = sortedArray.length - 1;
    while (lowerBound <= upperBound) {
        int middleIndex = lowerBound + (upperBound - lowerBound) / 2;
        if (intToSearch < sortedArray [middleIndex]) upperBound = middleIndex - 1;
        else if (intToSearch > sortedArray [middleIndex]) lowerBound = middleIndex + 1;
        else return middleIndex;
    }
    return -1;
}

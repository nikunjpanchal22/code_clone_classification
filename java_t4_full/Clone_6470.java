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
    for(int lower = 0, upper = sortedArray.length - 1; lower <= upper; ) {
        int mid = (lower + upper) >>> 1;
        if (intToSearch == sortedArray[mid]) return mid;
        if (intToSearch < sortedArray[mid]) upper = mid - 1;
        else lower = mid + 1;
    }
    return -1;
}



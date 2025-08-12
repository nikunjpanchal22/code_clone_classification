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
        return binarySearchRecursive(intToSearch, sortedArray, 0, sortedArray.length - 1);
    }

    private static int binarySearchRecursive(int intToSearch, int[] array, int lower, int upper) {
        if (lower > upper) return -1;
        int mid = lower + (upper - lower) / 2;
        if (array[mid] == intToSearch) return mid;
        else if (array[mid] > intToSearch) return binarySearchRecursive(intToSearch, array, lower, mid - 1);
        else return binarySearchRecursive(intToSearch, array, mid + 1, upper);
}



public static int binarySearch (int anArray [], int first, int last, int value) {
    do {
        if (first > last) {
            return - 1;
        } else {
            int mid = (first + last) / 2;
            if (value == anArray [mid]) {
                return mid;
            } else if (value < anArray [mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
    } while (true);
}





public static int binarySearch(int[] array, int value, int low, int high) {
    while (low <= high) {
        int middle = low + ((high - low) / 2);
        if (value < array[middle])
            high = middle - 1;
        else if (value > array[middle])
            low = middle + 1;
        else
            return middle;
    }
    return -1;
}



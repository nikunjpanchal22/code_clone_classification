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





public static int binarySearch(int[] arr, int low, int high, int x) {
    if (high >= low) {
        int mid = low + (high - low) / 2;
        int midVal = arr[mid];
        if (midVal < x)
            return binarySearch(arr, mid + 1, high, x);
        else if (midVal > x)
            return binarySearch(arr, low, mid - 1, x);
        else
            return mid;
    }
    return -1;
}



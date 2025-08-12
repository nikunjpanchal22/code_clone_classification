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





public static int binarySearch(int[] arr, int first, int last, int value) {
    while (first <= last) {
        int mid = (first + last) / 2;
        if (arr[mid] == value)
            return mid;
        else if (arr[mid] < value)
            first = mid + 1;
        else 
            last = mid - 1;
    }
    return -1;
}



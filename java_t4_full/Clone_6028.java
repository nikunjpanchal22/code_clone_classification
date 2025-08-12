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





public static int binarySearch(int[] anArray, int first, int last, int value) {
    for (; first <= last; ) {
        int mid = (first + last) >>> 1;
        if (value == anArray[mid])
            return mid;
        else if (value < anArray[mid])
            last = mid - 1;
        else
            first = mid + 1;
    }
    return -1;
}



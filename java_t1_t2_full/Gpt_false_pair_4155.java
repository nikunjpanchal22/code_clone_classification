public static void bubbleSort (int [] numArray) {
    int n = numArray.length;
    int temp = 0;
    for (int i = 0;
    i < n; i ++) {
        for (int j = 1;
        j < (n - i); j ++) {
            if (numArray [j - 1] > numArray [j]) {
                temp = numArray [j - 1];
                numArray [j - 1] = numArray [j];
                numArray [j] = temp;
            }
        }
    }
}


public static void bubbleSort (int [] numArray) {
    int length = numArray.length;
    int tempVal;
    for (int i = 0;
    i < length; i ++) {
        for (int j = 1;
        j < (length - i); j ++) {
            if (numArray [j - 1] > numArray [j]) {
                tempVal = numArray [j - 1];
                numArray [j - 1] = numArray [j];
                numArray [j] = tempVal;
            }
        }
    }
}

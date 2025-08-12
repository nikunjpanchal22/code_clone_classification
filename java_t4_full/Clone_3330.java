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
    boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < numArray.length - 1; i++) {
            if (numArray[i] > numArray[i+1]) {
                temp = numArray[i];
                numArray[i] = numArray[i+1];
                numArray[i+1] = temp;
                sorted = false;
            }
        }
    }
}



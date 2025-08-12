public static int findArray (int [] array, int [] subArray) {
    int index = - 1;
    arrayLoop : for (int i = 0;
    i < array.length; i ++) {
        if (array [i] == subArray [0]) {
            for (int j = 1;
            j < subArray.length; j ++) {
                if (i + j > array.length - 1 || array [i + j] != subArray [j]) continue arrayLoop;
            }
            index = i;
        }
    }
    return index;
}


public static int findArray (int [] array, int [] subArray) {
    int index = - 1;
    arrayLoop : for (int i = 0;
    i < array.length; i ++) {
        if (array [i] != subArray [0]) continue;

        for (int j = 1;
        j < subArray.length; j ++) {
            if (i + j > array.length - 1 || array [i + j] != subArray [j]) continue arrayLoop;
        }
            index = i;
    }
    return index;
}

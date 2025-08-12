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


 public static int findArray(int[] array, int[] subArray) {
    boolean found = true;
    int index = -1;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == subArray[0]) {
            for (int j = 0; j < subArray.length; j++) {
                if (i + j < array.length) {
                    if (array[i + j] != subArray[j]) {
                        found = false;
                        break;
                    }
                } else {
                    found = false;
                    break;
                }
            }
            if (found) {
                index = i;
                break;
            }
        }
    }
    return index;
}



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
    int index = -1;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == subArray[0]) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == subArray[count]) {
                    count++;
                    if (count == subArray.length) {
                        index = i;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
    return index;
}



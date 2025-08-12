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
    int arrayLen = array.length;
    int subArrayLen = subArray.length;
    for (int curr = 0; curr < arrayLen; curr++) {
        int count = 0;
        if (array[curr] == subArray[0]) {
            for (int i = 1, j = (curr + 1); i < subArrayLen && j < arrayLen; i++, j++) {
                if (array[j] == subArray[i]) {
                    count++;
                }
            }
            if (count == subArrayLen - 1) {
                index = curr;
                break;
            }
        }
    }
    return index;
}



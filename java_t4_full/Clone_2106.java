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
        int count = 0;
        // check if current element of array matches with first element of subArray
        if (array[i] == subArray[0]) {
            for (int j = i; j < array.length; j++) {
                // check if elements of array match with elements of subArray
                if (array[j] == subArray[count]) {
                    count++;
                    // check if all the elements of subArray found in array
                    if (count == subArray.length) {
                        index = i;
                        break;
                    }
                }
                // if any element of subArray not found in array
                else break;
            }
        }
    }
    return index; 
}



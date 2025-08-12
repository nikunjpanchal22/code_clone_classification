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
    int arrayLength = array.length;
    int subArrayLength = subArray.length;
    int index = -1;
    for (int i = 0; i < arrayLength; i++) {
        int count = 0;
        //Check if first element of subArray matches with the array's current index, otherwise you can ignore this loop and move to second iteration.
        if (array[i] == subArray[0]) {
            for (int j = i + 1; j < arrayLength; j++) {
                //Check if all the element of subArray matches with the array.
                if (array[j] == subArray[count + 1]) {
                    count++;
                    //If all the elements are matched then break the loop and return the index value.
                    if (count == subArrayLength - 1) {
                        index = i;
                        break;
                    }
                } else {
                    //If the element of subArray didn't match with the array's current index, then restart the loop and move to second iteration.
                    break;
                }
            }
        }
    }
    return index;
}



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
    if(subArray.length > array.length) return -1;
    String arr = Arrays.toString(array).replace(",","");
    String subArr = Arrays.toString(subArray).replace(",","");
    return arr.indexOf(subArr);
}



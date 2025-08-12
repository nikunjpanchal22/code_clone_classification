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
    int index = IntStream.range(0, array.length-subArray.length+1)
                         .filter(i -> IntStream.range(0, subArray.length).allMatch(j -> array[i+j] == subArray[j]))
                         .findFirst().orElse(-1);
    return index;
}



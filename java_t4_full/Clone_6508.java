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
    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
    List<Integer> sublist = Arrays.stream(subArray).boxed().collect(Collectors.toList());
    return list.indexOf(sublist.get(0));
}



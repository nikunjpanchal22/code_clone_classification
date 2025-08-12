public static int mode (int [] [] arr) {
    List < Integer > list = new ArrayList < Integer > ();
    for (int i = 0;
    i < arr.length; i ++) {
        for (int j = 0;
        j < arr [i].length; j ++) {
            list.add (arr [i] [j]);
        }
    }
    int [] vector = new int [list.size ()];
    for (int i = 0;
    i < vector.length; i ++) {
        vector [i] = list.get (i);
    }
}



 

public static int mode(int[][] arr) {
    List<Integer> list = Arrays.stream(arr).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
    int[] vector = new int[list.size()];
    int index = 0;
    for (Integer i : list) {
        vector[index++] = i;
    }
}



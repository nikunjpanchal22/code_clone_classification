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
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        list.addAll(Arrays.stream(arr[i]).boxed().collect(Collectors.toList()));
    }
    int[] vector = list.stream().mapToInt(Integer::intValue).toArray();
}



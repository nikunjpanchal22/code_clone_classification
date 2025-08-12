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
     Map<Integer, Integer> counts = new HashMap<>();
     for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
             if (counts.containsKey(arr[i][j])) {
                 counts.put(arr[i][j], counts.get(arr[i][j]) + 1);
             } else {
                 counts.put(arr[i][j], 1);
             }
         }
     }
 
     int maxCount = 0;
     int mode = 0;
     for (int num : counts.keySet()) {
         int count = counts.get(num);
         if (count > maxCount) {
             mode = num;
             maxCount = count;
         }
     }
     return mode;
}



public static int [] removeDuplicates (int [] arr) {
    int end = arr.length;
    for (int i = 0;
    i < end; i ++) {
        for (int j = i + 1;
        j < end; j ++) {
            if (arr [i] == arr [j]) {
                arr [j] = arr [end - 1];
                end --;
                j --;
            }
        }
    }
    int [] whitelist = new int [end];
    System.arraycopy (arr, 0, whitelist, 0, end);
    return whitelist;
}


 public static int [] removeDuplicates (int [] arr) {
    int end = arr.length;
    HashSet<Integer> set = new HashSet<>(end);
    for (int i = 0; i < end; i++) {
        set.add(arr[i]);
    }
    int[] whitelist = new int[set.size()];
    int j = 0;
    for (Integer x : set) {
        whitelist[j] = x; 
        j++;
    }
    return whitelist;
}



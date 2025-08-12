public static int [] removeDuplicates (int [] arr) {
    boolean [] set = new boolean [1001];
    int totalItems = 0;
    for (int i = 0;
    i < arr.length; ++ i) {
        if (! set [arr [i]]) {
            set [arr [i]] = true;
            totalItems ++;
        }
    }
    int [] ret = new int [totalItems];
    int c = 0;
    for (int i = 0;
    i < set.length; ++ i) {
        if (set [i]) {
            ret [c ++] = i;
        }
    }
    return ret;
}



public static int[] removeDuplicates(int[] arr) {
    LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
    for (int i : arr) {
        set.add(i);
    }
    int[] result = new int[set.size()];
    int index = 0;
    for (int i : set){
        result[index++] = i;
    }
    return result;
}



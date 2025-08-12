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
    Set<Integer> set = new TreeSet<Integer>();
    for (int i : arr) {
        set.add(i);
    }
 
    int[] res = new int[set.size()];
    Iterator<Integer> iterator = set.iterator();
    for (int i = 0; iterator.hasNext(); i++) {
        res[i] = iterator.next();
    }
    return res;
}



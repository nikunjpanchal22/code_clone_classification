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
    List<Integer> res = new ArrayList<>();
    for (int n : arr) {
        if (!res.contains(n)) {
            res.add(n);
        }
    }
    int[] resArray = new int[res.size()];
    for (int i = 0; i < res.size(); i++) {
        resArray[i] = res.get(i);
    }
    return resArray;
}



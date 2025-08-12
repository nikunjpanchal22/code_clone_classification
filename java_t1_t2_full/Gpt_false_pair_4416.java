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


public static int [] removeDuplicates (int [] arr) {
    boolean [] bucket = new boolean [1001];
    int numElements = 0;
    for (int i = 0;
    i < arr.length; ++ i) {
        if (! bucket [arr [i]]) {
            bucket [arr [i]] = true;
            numElements ++;
        }
    }
    int [] ret = new int [numElements];
    int index = 0;
    for (int i = 0;
    i < bucket.length; ++ i) {
        if (bucket [i]) {
            ret [index ++] = i;
        }
    }
    return ret;
}

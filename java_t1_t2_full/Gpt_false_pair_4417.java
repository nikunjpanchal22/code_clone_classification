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
    boolean [] hashTable = new boolean [1001];
    int len = 0;
    for (int i = 0;
    i < arr.length; ++ i) {
        if (! hashTable [arr [i]]) {
            hashTable [arr [i]] = true;
            len ++;
        }
    }
    int [] ret = new int [len];
    int curIndex = 0;
    for (int i = 0;
    i < hashTable.length; ++ i) {
        if (hashTable [i]) {
            ret [curIndex ++] = i;
        }
    }
    return ret;
}

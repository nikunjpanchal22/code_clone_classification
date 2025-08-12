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
    Set<Integer> set = new HashSet<Integer>();
    for(int num: arr){
        set.add(num);
    }
    int[] ret = new int[set.size()];
    int i = 0;
    for(int num: set){
        ret[i++] = num;
    }
    return ret;
}



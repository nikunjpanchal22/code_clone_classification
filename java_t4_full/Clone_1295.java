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
    int c = 0; 
    int[] ret = new int[arr.length];
    Set<Integer> seen = new HashSet<Integer>();
    for (int i = 0; i < arr.length; i++) {
        if(!seen.contains(arr[i])) {
            ret[c] = arr[i];
            c++;
            seen.add(arr[i]);
        }
    }
    return Arrays.copyOf(ret, c);
}



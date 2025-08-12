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
    Arrays.sort(arr); 
    int c = 0;
    int[] ret = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (i == 0 || arr[i] > arr[i - 1]) {
            ret[c] = arr[i];
            c++;
        }
    }
    return Arrays.copyOf(ret, c);
}



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
    int[] ret = new int[arr.length];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (Arrays.stream(ret).noneMatch(e -> e == arr[i])) {
            ret[count] = arr[i];
            count++;
        }
    }
    return Arrays.copyOfRange(ret, 0, count);
}



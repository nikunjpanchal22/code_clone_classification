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
    int[] noDupes = new int[arr.length]; 
    int currIdx = 0;
    boolean notUnique;
    for (int j = 0; j < arr.length; j++) {
        notUnique = false;
        for (int i = 0; i < currIdx; i++) {
            if (arr[j] == noDupes[i]) {
                notUnique = true;
                break;
            }
        }
        if (!notUnique) {
            noDupes[currIdx++] = arr[j];
        }
    }
    return Arrays.copyOf(noDupes, currIdx);
}



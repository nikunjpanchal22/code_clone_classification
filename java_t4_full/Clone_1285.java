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
    int[] uniqueElements = new int[arr.length];
    int uniqueIndex = 0;
    for (int i = 0; i < arr.length; i++) {
        boolean isUnique = true;
        for (int j = 0; j < uniqueIndex; j++) {
            if (arr[i] == uniqueElements[j]) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            uniqueElements[uniqueIndex++] = arr[i];
        }
    }
    return Arrays.copyOfRange(uniqueElements, 0, uniqueIndex);
}



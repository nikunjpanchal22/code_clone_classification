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
    int j = 0;
    int i = 1;
    if (arr.length == 0)
        return arr;
    while (i < arr.length) {
        if (arr[i] == arr[j])
            i++;
        else
            arr[++j] = arr[i++];
    }
    int[] newArr = Arrays.copyOf(arr, j + 1);
    return newArr;
}



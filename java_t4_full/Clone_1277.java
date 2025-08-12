public static int [] removeDuplicates (int [] arr) {
    int end = arr.length;
    for (int i = 0;
    i < end; i ++) {
        for (int j = i + 1;
        j < end; j ++) {
            if (arr [i] == arr [j]) {
                arr [j] = arr [end - 1];
                end --;
                j --;
            }
        }
    }
    int [] whitelist = new int [end];
    System.arraycopy (arr, 0, whitelist, 0, end);
    return whitelist;
}


 public static int [] removeDuplicates (int [] arr) {
    int end = arr.length;
    int [] whitelist = new int [end];
    int count = 0;
    for (int i = 0;i<end;i++) {
        int mark = 0;
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                ++mark;
            }
        }
        if (mark == 0) {
            whitelist[count] = arr[i];
            count++;
        } 
    }
    int [] tx = new int [count];
    System.arraycopy(whitelist, 0, tx, 0, count); 
    return tx;
}



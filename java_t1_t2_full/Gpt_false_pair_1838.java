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
    for (int i = 0; i < end; i++) {
        for (int j = i + 1; j < end; j++) {
            if (arr[i] == arr[j]) {
                while (end-1 > j && arr[j] == arr[end-1]) 
                    end--;

                // swap the duplicate element 
                int temp = arr[j];
                arr[j] = arr[end-1];
                arr[end-1] = temp;
                end--;
            }
        }
    }
  
    int[] whitelist = new int[end];
    System.arraycopy(arr, 0, whitelist, 0, end);
    return whitelist;
}

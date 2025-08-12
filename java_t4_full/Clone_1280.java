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


 public static int[] removeDuplicates(int[] arr) {
    int uniqueCount = 0;
    int[] uniqueArr = new int[arr.length];
    outer : for(int i=0;i<arr.length;i++){
        for(int j=0;j<uniqueCount;j++){
            if(uniqueArr[j]==arr[i]){
                continue outer;
            }     
        }
        uniqueArr[uniqueCount] = arr[i];
        uniqueCount++;
    }
    int[] whitelist = new int[uniqueCount];
    System.arraycopy(uniqueArr, 0, whitelist, 0, uniqueCount);
    return whitelist;
}



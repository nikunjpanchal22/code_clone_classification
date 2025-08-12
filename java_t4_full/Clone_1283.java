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


 public static int [] removeDuplicates (int [] arr) 
{ 
    int end = arr.length; 
    int [] whitelist = new int [end]; 
       
    int i = 0, j = 0;
    HashSet<Integer> set = new HashSet<>(); 
       
    while ( i < end ) 
    {
        if ( set.add(arr[i]) ) 
        { 
            whitelist[j++] = arr[i]; 
        } 
        i++;
    } 
       
    return whitelist; 
} 



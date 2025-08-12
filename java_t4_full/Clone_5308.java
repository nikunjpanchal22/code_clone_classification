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
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i : arr){
        if(!list.contains(i)){
            list.add(i);
        }
    }
    return list.stream().mapToInt(i->i).toArray();
}



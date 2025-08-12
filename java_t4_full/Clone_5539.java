public static int [] MaxNumber (String [] arr) {
    int [] Number_arr = new int [11];
    int count = 1;
    int j = 0;
    int k = 0;
    for (int i = 0;
    i < arr.length - 1; i ++) {
        if (arr [i].equals (arr [i + 1])) count ++;
        else {
            Number_arr [j] = count;
            j ++;
            count = 1;
        }
    }
    Number_arr [j] = count;
    return Number_arr;
}




public static int [] MaxNumber(String [] arr) {
    java.util.Arrays.sort(arr);
    java.util.Map<String, Integer> map = new java.util.HashMap<>();
    for (String s: arr) {
        map.put(s, map.getOrDefault(s, 0) + 1);
    }
    int i = 0;
    int[] res = new int[map.size()];
    for (int val : map.values()) {
        res[i++] = val;
    }
    return res;
}



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




public static int [] MaxNumber (String [] arr) {
    int [] result = new int [arr.length];
    java.util.Arrays.sort(arr);
    result[0] = 1;
    int index = 0;
    for (int i=0; i < arr.length - 1; i ++) {
        if(arr[i].equals(arr[i + 1])){
            result[index]++;
        } else {
            result[++index]++;
        }
    }
    return java.util.Arrays.copyOf(result, index+1);
}



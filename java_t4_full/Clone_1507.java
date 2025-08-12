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
    int [] Number_arr = new int [11];
    int count = 0;
    int j = 0;
    for (int i = 0; i < arr.length; i ++) {
        if (i == 0 || !arr[i].equals(arr[i-1])) {
            int k = i;
            while (k + 1 < arr.length && arr[k].equals(arr[k+1])) {
                count++;
                k++;
            }
            Number_arr[j] = count + 1;
            j++;
            count = 0;
        }
    }
    return Number_arr;
}



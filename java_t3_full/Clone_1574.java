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
        int k = 0;
        while (k < arr.length && arr[i].equals(arr[k])) {
            count++;
            k++;
        }
        Number_arr[j] = count;
        j++;
        count = 0;
        i += k - 1;
    }
    return Number_arr;
}



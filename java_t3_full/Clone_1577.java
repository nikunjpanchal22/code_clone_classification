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
            count = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i].equals(arr[k])) {
                    count ++;
                }
            }
            Number_arr[j] = count;
            j++;
        }
    }
    return Number_arr;
}



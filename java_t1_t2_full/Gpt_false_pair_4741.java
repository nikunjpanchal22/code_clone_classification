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
    int counter = 1;
    int point = 0;
    int secondNum = 0;
    for (int i = 0;
    i < arr.length - 1; i ++) {
        if (arr [i].equals (arr [i + 1])) counter ++;
        else {
            Number_arr [point] = counter;
            point ++;
            counter = 1;
        }
    }
    Number_arr [point] = counter;
    return Number_arr;
}

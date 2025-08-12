static int [] sort (int arr []) {
    for (int i = 0;
    i < arr.length; i ++) {
        for (int j = i;
        j < arr.length; j ++) {
            if (arr [j] < arr [i]) {
                int temp = arr [i];
                arr [i] = arr [j];
                arr [j] = temp;
            }
        }
    }
    return arr;
}



static int [] sort (int arr []) {
    for (int i = 0; i < arr.length - 1; i ++) {
        for (int j = 0; j < arr.length - i - 1; j ++) {
            if (arr [j] > arr [j + 1]) {
                int temp = arr [j];
                arr [j] = arr [j + 1];
                arr [j + 1] = temp;
            }
        }
    }
    return arr;
}



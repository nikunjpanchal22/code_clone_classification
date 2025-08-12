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
    for (int i = 1;
    i < arr.length; i ++) {
        int j = i;
        while (j > 0 && arr [j] < arr [j - 1]) {
            int temp = arr [j];
            arr [j] = arr [j - 1];
            arr [j - 1] = temp;
            j --;
        }
    }
    return arr;
}



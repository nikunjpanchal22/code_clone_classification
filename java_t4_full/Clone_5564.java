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



public static int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        int min = arr[i];
        int minId = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                minId = j;
            }
        }
        int temp = arr[i];
        arr[i] = min;
        arr[minId] = temp;
    }
    return arr;
}



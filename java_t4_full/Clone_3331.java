public static void bubbleSort (int [] numArray) {
    int n = numArray.length;
    int temp = 0;
    for (int i = 0;
    i < n; i ++) {
        for (int j = 1;
        j < (n - i); j ++) {
            if (numArray [j - 1] > numArray [j]) {
                temp = numArray [j - 1];
                numArray [j - 1] = numArray [j];
                numArray [j] = temp;
            }
        }
    }
}





public static void bubbleSort(int a[]) {
    int n = a.length;
    for(int k = 0; k< n-1; k++) {
        boolean swap = false;
        for(int i = 0; i < n-k-1; i++) {
            if(a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                swap = true;
            }
        }
        if (!swap)
            break;
    }
}



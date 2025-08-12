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





public static void bubbleSort(int[] arr) {
    for(int i = 0; i < arr.length; i++)  {
        for(int j = i+1; j<arr.length; j++)  {
            if(arr[i] > arr[j]) {
                arr[j] = arr[j] ^ arr[i];
                arr[i] = arr[j] ^ arr[i];
                arr[j] = arr[j] ^ arr[i];
            }
        }
    }
}



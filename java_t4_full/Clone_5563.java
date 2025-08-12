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


  
public static int[] sort(int arr[]) { 
    int n = arr.length; 
    boolean swapped;
    do {
        swapped = false;
        for (int i = 1; i < n; i ++) {
            if (arr[i-1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                swapped = true;
            }
        }
    } while (swapped);
    return arr; 
} 



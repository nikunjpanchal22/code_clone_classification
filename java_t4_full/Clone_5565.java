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
    int n = arr.length;  
    for (int i = 0; i < n-1; i++){
        int index = i;  
        for (int j = i + 1; j < n; j++){  
            if (arr[j] < arr[index]){  
                index = j;  
            }  
        }  
        int smallestNumber = arr[index];   
        arr[index] = arr[i];  
        arr[i] = smallestNumber;  
    }  
    return arr;
}



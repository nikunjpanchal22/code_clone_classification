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




 
public static int[] sort(int array[]) {  
    int n = array.length;  
    int temp = 0;  
     for(int i = 0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(array[j-1] > array[j]){  
                             temp = array[j-1];  
                             array[j-1] = array[j];  
                             array[j] = temp;  
                     }  
             }  
     }
     return array;
}




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
    if(arr.length <= 1){
        return arr;
    }
    int midpoint = arr.length / 2;
    int[] left = new int[midpoint];
    int[] right;
    if(arr.length % 2 == 0){
        right = new int[midpoint];
    } else {
        right = new int[midpoint+1];
    }
    int[] result = new int[arr.length];
    System.arraycopy(arr, 0, left, 0, midpoint);
    if(arr.length % 2 == 0){
        System.arraycopy(arr, midpoint, right, 0, midpoint);
    } else {
        System.arraycopy(arr, midpoint, right, 0, midpoint+1);
    }
    left = sort(left);
    right = sort(right);
    result = merge(left, right);
    return result;
}



static int search (int [] A, int K) {
    int l = 0;
    int u = A.length - 1;
    int m;
    while (l <= u) {
        m = (u - l) / 2 + l;
        if (A [m] < K) l = m + 1;
        else if (A [m] == K) return m;
        else u = m - 1;
    }
    return - 1;
}


 static int search(int[] arr, int K){
    int low = 0;
    int high = arr.length - 1;
    
    while(low <= high ){
        int mid = low + (high - low) / 2;
        if(arr[mid] == K){
            return mid;
        }else if(arr[mid] < K){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }
    return -1;
}



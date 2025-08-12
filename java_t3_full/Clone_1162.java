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
    int lo = 0;
    int hi = arr.length - 1;
    int mid;
    while(lo <= hi){
        mid = (hi - lo) / 2 + lo;
        if(arr[mid] == K){
            return mid;
        }else if(arr[mid] > K){
            hi = mid - 1;
        }else{
            lo = mid + 1;
        }
    }
    return -1;
}



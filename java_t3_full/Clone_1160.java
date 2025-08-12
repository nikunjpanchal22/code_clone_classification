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


 static int search(int[] list, int K){
    int min = 0;
    int max = list.length - 1;
    int mid;
    while(min <= max){
        mid = (max - min) / 2 + min;
        if(list[mid] < K){
            min = mid + 1;
        }else if(list[mid] == K){
            return mid;
        }else{
            max = mid - 1;
        }
    }
    return -1;
}



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


 static int search(int[] A, int K) {
    int low = 0;
    int high = A.length - 1;
    int mid;
    while (low <= high) {
        mid = (high - low) / 2 + low;
        if (A[mid] == K) {
            return mid;
        } else if (A[mid] > K) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;
}



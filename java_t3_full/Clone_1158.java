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


 static int search (int [] A, int K) {
    int left = 0;
    int right = A.length - 1;
    int middle;
    while (left <= right) {
        middle = (right - left) / 2 + left;
        if (A [middle] == K) {
          return middle;
        } else if (A [middle] < K) {
          left = middle + 1;
        } else {
          right = middle - 1;
        }
    }
    return -1;
}



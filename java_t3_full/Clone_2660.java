private void sort (int [] input, int startIndx, int endIndx) {
    int endIndexOrig = endIndx;
    int startIndexOrig = startIndx;
    if (startIndx >= endIndx) return;
    int pavitVal = input [endIndx];
    while (startIndx <= endIndx) {
        while (input [startIndx] < pavitVal) startIndx ++;
        while (input [endIndx] > pavitVal) endIndx --;
        if (startIndx <= endIndx) {
            int tmp = input [startIndx];
            input [startIndx] = input [endIndx];
            input [endIndx] = tmp;
            startIndx ++;
            endIndx --;
        }
    }
    sort (input, startIndexOrig, endIndx);
    sort (input, startIndx, endIndexOrig);
}





void sort(int[] a, int b, int e) {
    if (b >= e) 
        return; 
    int pivot = a[e];
    int l = b;
    int h = e;
    while (l <= h) {
        while (a[l] < pivot) 
            l++;
        while (a[h] > pivot) 
            h--;
        if (l <= h) {
            int tmp = a[l]; 
            a[l++] = a[h]; 
            a[h--] = tmp;
        }
    } 
    sort(a, b, h);
    sort(a, l, e);
}



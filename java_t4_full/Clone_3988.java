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





public static void sort(int[] array, int lo, int hi) {
    int i=lo, j=hi, h; 
    int x=array[(lo+hi)/2]; 
    do {
        while (array[i]<x) 
            i++; 
        while (array[j]>x) 
            j--; 
        if (i<=j) {
            h=array[i]; 
            array[i]=array[j]; 
            array[j]=h; 
            i++; 
            j--;
        } 
    } while (i<=j); 
    if (lo<j) 
        sort(array, lo, j);
    if (i<hi) 
        sort(array, i, hi);
}



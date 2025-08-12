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





void sort(int arr[], int left, int right) {
    int i = left, j = right; 
    int tmp; 
    int pivot = arr[(left + right) / 2];
    while (i <= j) {
        while (arr[i] < pivot) 
            i++; 
        while (arr[j] > pivot) 
            j--; 
        if (i <= j) {
            tmp = arr[i]; 
            arr[i++] = arr[j]; 
            arr[j--] = tmp;
        }
    }
    if (left < j) 
        sort(arr, left, j); 
    if (i < right) 
        sort(arr, i, right);
}



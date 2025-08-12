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





void sort(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n-1; i++){
        int min_idx = i;
        for (int j = i+1; j < n; j++)
            if (arr[j] < arr[min_idx]) min_idx = j;
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }
}



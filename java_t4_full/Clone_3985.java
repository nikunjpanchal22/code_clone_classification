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




private void sort(int[] array, int left, int right) {

    if (left < right) {

        int pivot = partition(array, left, right);

        sort(array, left, pivot - 1);
        sort(array, pivot + 1, right);
    }
}



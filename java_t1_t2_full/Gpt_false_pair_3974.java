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


private void sort (int [] input, int startIndx, int endIndx) {
    int endIndexOrig = endIndx;
    int startIndexOrig = startIndx;
    if (startIndx >= endIndx) return;
    int pavitVal = input [endIndx];
    int startIndex = startIndx;
    int endIndex = endIndx;
    while (startIndex <= endIndex) {
        while (input [startIndex] < pavitVal) startIndex ++;
        while (input [endIndex] > pavitVal) endIndex --;
        if (startIndex <= endIndex) {
            int tmp = input [startIndex];
            input [startIndex] = input [endIndex];
            input [endIndex] = tmp;
            startIndex ++;
            endIndex --;
        }
    }
    sort (input, startIndexOrig, endIndex);
    sort (input, startIndex, endIndexOrig);
}

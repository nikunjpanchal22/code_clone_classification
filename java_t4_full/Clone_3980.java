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




private void sort(int[] arr, int start, int finish) {

    int i = (start - finish) / 2 + start;
    int pivot = arr[i];
    arr[i] = arr[finish];
    arr[finish] = pivot;
    int count = start;

    for (i = start; i < finish; i++) {
        if (arr[i] <= pivot) {
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count++;
        }
    }
    
    arr[finish] = arr[count];
    arr[count] = pivot;

    if (start < count - 1) sort(arr, start, count - 1);

    if (count + 1 < finish) sort(arr, count + 1, finish);
}



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






private void sort (int[] input, int start, int end) {
            if (start < end) {
                int divideIndx = divide(input, start, end);
                sort(input, start, divideIndx-1);
                sort(input, divideIndx+1, end);
            }
        }

        private int divide(int[] input, int left, int right) {
            int pivot = input[right];
            int i = (left-1);
            for (int j=left; j<right; j++)
            {
                if (input[j] < pivot)
                {
                    i++;
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
            int temp = input[i+1];
            input[i+1] = input[right];
            input[right] = temp; 
            return i+1;
}



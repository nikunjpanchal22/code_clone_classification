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





void sort(int arr[], int left, int right)
{
            if (left < right) {
                int middle = (left+right)/2;
                sort(arr, left, middle);
                sort(arr , middle+1, right);
                merge(arr, left, middle, right);
            }
        }

        void merge(int arr[], int left, int middle, int right)
        {
            int n1 = middle - left + 1;
            int n2 = right - middle;
            int L[] = new int [n1];
            int R[] = new int [n2];
            for (int i=0; i<n1; ++i) L[i] = arr[left + i];
            for (int j=0; j<n2; ++j) R[j] = arr[middle + 1+ j];
            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2){
                if (L[i] <= R[j]){
                    arr[k] = L[i];
                    i++;
                }else{
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1){
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < n2){
                arr[k] = R[j];
                j++;
                k++;
            }
}



public void sort (int [] input) {
    for (int i = 0;
    i < input.length - 1; i ++) {
        int k = i + 1;
        int nxtVal = input [k];
        while (input [k - 1] > nxtVal) {
            input [k] = input [k - 1];
            k --;
            if (k == 0) break;
        }
        input [k] = nxtVal;
    }
    System.out.println ("Medium sorting is done and the result is :");
    for (int i : input) {
        System.out.print (i + ",");
    }
}





public void sort(int arr[]){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);
        for (int i=n-1; i>=0; i--){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr, i, 0);
            }
        }
        private void heapify(int arr[], int n, int i){
            int largest = i;
            int l = 2*i + 1;
            int r = 2*i + 2;
            if (l < n && arr[l] > arr[largest])
                largest = l;
            if (r < n && arr[r] > arr[largest])
                largest = r;
            if (largest != i){
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
                heapify(arr, n, largest);
            }
}



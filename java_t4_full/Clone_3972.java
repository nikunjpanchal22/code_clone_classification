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





public void sort(int arr[]) {
            sort(arr, 0, arr.length-1);
        }
        private void sort(int arr[], int low, int high){
            if (low < high){
                int pi = partition(arr, low, high);
                sort(arr, low, pi-1);
                sort(arr, pi+1, high);
            }
        }
        private int partition(int arr[], int low, int high){
            int pivot = arr[high]; 
            int i = (low-1);
            for (int j=low; j<high; j++){
                if (arr[j] < pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
            return i+1;
}



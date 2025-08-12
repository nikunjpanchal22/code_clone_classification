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





public void sort(int[] arr){
            sort(arr, 0, arr.length - 1);
        }
        private void sort(int[] L, int i, int j){
            if (L[j] < L[i]){
                int tmp = L[i];
                L[i] = L[j];
                L[j] = tmp;
            }
            if (j - i > 1){
                int t = (j - i + 1) / 3;
                sort(L, i, j - t);
                sort(L, i + t, j);
                sort(L, i, j - t);
            }
}



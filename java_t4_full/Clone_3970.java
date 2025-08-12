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
    int n = arr.length;
    int max = Arrays.stream(arr).max().getAsInt();
    int min = Arrays.stream(arr).min().getAsInt();
    int range = max - min + 1;
    int count[] = new int[range];
    int output[] = new int[n];
    for (int i=0; i<n; i++){
        count[arr[i]-min]++;
    }
    for (int i=1;i<count.length;++i){
        count[i] += count[i-1];
    }
    for (int i = n-1; i >= 0; i--){
        output[count[arr[i] - min] - 1] = arr[i];
        count[arr[i] - min]--;
    }
    for (int i=0; i<n; i++){
        arr[i] = output[i];
    }
}



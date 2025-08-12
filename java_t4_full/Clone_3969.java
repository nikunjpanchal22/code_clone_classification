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
        if (n <= 0)
            return;
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > maxValue)
                maxValue = arr[i];
            if (arr[i] < minValue)
                minValue = arr[i];
        }
        int bucketCount = maxValue - minValue + 1;
        int[][] buckets = new int[bucketCount][0];
        for (int i = 0; i < n; i++){
            int index = arr[i] - minValue;
            buckets[index] = append(buckets[index], arr[i]);
        }
        int arrIndex = 0;
        for (int[] bucket : buckets){
            for (int value : bucket)
                arr[arrIndex++] = value;
        }
    }
    public int[] append(int[] arr, int value){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
}



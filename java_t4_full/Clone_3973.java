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





public void sort(int[] input) {
    for (int i = 0; i < input.length; i++) {
        int min = input[i];
        int minId = i;
        for (int j = i+1; j < input.length; j++) {
            if (input[j] < min) {
                min = input[j];
                minId = j;
            }
        }
        // swapping
        int temp = input[i];
        input[i] = min;
        input[minId] = temp;
    }
}



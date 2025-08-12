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


 public void sort (int [] input) {
    for (int out = 0; out < input.length - 1; out++) {
        int nxtVal = input [out+1];
        int k = out;
        for (int j = out; j >= 0 && (input[k] > nxtVal); j--) {
            input[j+1] = input[k];
            k--;
        }
        input[k+1] = nxtVal;
    }
    System.out.println ("Medium sorting is done and the result is :");
    for (int i : input) {
        System.out.print (i + ",");
    }
}



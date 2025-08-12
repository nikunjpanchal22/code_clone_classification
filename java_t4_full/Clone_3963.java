public void sort (int [] input) {
    for (int i = 0;
    i < input.length; i ++) {
        for (int j = i + 1;
        j < input.length; j ++) {
            if (input [i] > input [j]) {
                int tmp = input [i];
                input [i] = input [j];
                input [j] = tmp;
            }
        }
    }
    System.out.println ("Slow sorting is done and the result is :");
    for (int i : input) {
        System.out.print (i + ",");
    }
}






public void sort(int[] input) {
    int n = input.length;

    for (int i = 0; i < n-1; i++) {
        int min_idx = i;
        for (int j = i+1; j < n; j++)
            if (input[j] < input[min_idx])
                min_idx = j;

        int temp = input[min_idx];
        input[min_idx] = input[i];
        input[i] = temp;
    }
    System.out.println(Arrays.toString(input));
}



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






public void sort(int input[]) {
    int n = input.length;

    for (int gap = n/2; gap > 0; gap /= 2) {
        for (int i = gap; i < n; i += 1) {
            int temp = input[i];
            int j;
            for (j = i; j >= gap && input[j - gap] > temp; j -= gap)
                input[j] = input[j - gap];
                
            input[j] = temp;
        }
    }
    System.out.println(Arrays.toString(input));
}



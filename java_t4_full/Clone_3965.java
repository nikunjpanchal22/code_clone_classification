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

            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(input, n, i);

            for (int i=n-1; i>=0; i--) {
                int temp = input[0];
                input[0] = input[i];
                input[i] = temp;
                heapify(input, i, 0);
            }
            System.out.println(Arrays.toString(input));
        }

        void heapify(int input[], int n, int i) {
            int largest = i;
            int l = 2*i + 1;
            int r = 2*i + 2;

            if (l < n && input[l] > input[largest])
                largest = l;

            if (r < n && input[r] > input[largest])
                largest = r;

            if (largest != i) {
                int swap = input[i];
                input[i] = input[largest];
                input[largest] = swap;
                heapify(input, n, largest);
            }
}



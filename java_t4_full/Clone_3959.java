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






public void sort(int[] input, int start, int end) {
            if (start < end) {
                int pivot = partition(input, start, end);
                sort(input, start, pivot-1);
                sort(input, pivot+1, end);
            }
        }

        public int partition(int[] input, int start, int end) {
            int pivot = input[end];
            int i = (start-1);
        
            for (int j=start; j<end; j++) {
                if (input[j] < pivot) {
                    i++;
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        
            int temp = input[i+1];
            input[i+1] = input[end];
            input[end] = temp;
        
            return i+1;
}



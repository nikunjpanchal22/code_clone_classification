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






public void sort(int input[], int left, int right) {
            if (left < right) {
                int m = (left+right)/2;
                sort(input, left, m);
                sort(input , m+1, right);
                merge(input, left, m, right);
            }
        }

        void merge(int input[], int left, int m, int right) {
            int n1 = m - left + 1;
            int n2 = right - m;
            int L[] = new int [n1];
            int R[] = new int [n2];

            for (int i=0; i<n1; ++i)
                L[i] = input[left + i];
            for (int j=0; j<n2; ++j)
                R[j] = input[m + 1+ j];

            int i = 0, j = 0;

            int k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    input[k] = L[i];
                    i++;
                } else {
                    input[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                input[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                input[k] = R[j];
                j++;
                k++;
            }
            System.out.println(Arrays.toString(input));
}



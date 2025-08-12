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
    for (int i = 0; i < input.length; i++) {
        for (int j = input.length - 1; j > i; j--) {
            if (input[j - 1] > input[j]) {
                int tmp = input[j - 1];
                input[j - 1] = input[j];
                input[j] = tmp;
            }
        }
    }
    System.out.println("Slow sorting is done and the result is:");
    for (int i : input) {
        System.out.print(i + ",");
        }
}



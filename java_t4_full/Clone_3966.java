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
    int maxVal = Arrays.stream(input).max().getAsInt();
    int[] bucket = new int[maxVal + 1];

    for (int i = 0; i < bucket.length; i++)
        bucket[i] = 0;

    for (int i = 0; i < input.length; i++)
        bucket[input[i]]++;

    int outPos = 0;
    for (int i = 0; i < bucket.length; i++)
        for (int j = 0; j < bucket[i]; j++)
            input[outPos++] = i;

    System.out.println(Arrays.toString(input));
}



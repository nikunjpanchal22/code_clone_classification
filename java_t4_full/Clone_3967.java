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
    List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
    Collections.sort(list);
    list.forEach(i -> System.out.print(i + ","));
}



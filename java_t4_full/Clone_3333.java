public static void bubbleSort (int [] numArray) {
    int n = numArray.length;
    int temp = 0;
    for (int i = 0;
    i < n; i ++) {
        for (int j = 1;
        j < (n - i); j ++) {
            if (numArray [j - 1] > numArray [j]) {
                temp = numArray [j - 1];
                numArray [j - 1] = numArray [j];
                numArray [j] = temp;
            }
        }
    }
}





public void bubbleSort(int numArray[]){
   int n = numArray.length;
   IntStream.range(0, n-1)
     .flatmap(i -> IntStream.range(0,n-i-1))
     .filter(j -> numArray[j] > numArray[j+1])
     .forEach(j -> {
        int temp = numArray[j];
        numArray[j] = numArray[j+1];
        numArray[j+1] = temp;
     });
}



public static void main (String [] args) {
    int large [] = new int [10];
    int array [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};
    int k = 0;
    for (int i = 0;
    i < array.length; i ++) {
        large [k ++] = getMax (0, array);
    }
    System.out.println ("Largest 5 is: " + Arrays.toString (Arrays.copyOf (large, 5)));
}





public static void main (String [] args) {
            int size=10;
            int [] large = createArray(size);
            int [] array = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};
            computeMaxNumbers(large, array, size);
            System.out.println ("Largest 5 is: " + 
                                Arrays.toString (Arrays.copyOfRange(large, 0, 5)));
        }

        static void computeMaxNumbers(int[] large, int[] array, int size){
            int k = 0;
            for (int i = 0; i < size; i++) {
                large [k ++] = getMax (array);
            }
}



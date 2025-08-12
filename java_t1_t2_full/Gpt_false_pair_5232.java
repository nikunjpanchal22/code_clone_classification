public static void main (String [] args) {
    Random r = new Random ();
    int dims = 1 + r.nextInt (3);
    int [] sizes = new int [dims];
    for (int i = 0;
    i < sizes.length; i ++) sizes [i] = 1 + r.nextInt (3);
    System.out.println ("Creating array with dimensions / sizes: " + Arrays.toString (sizes).replaceAll (", ", "]["));
    Object multiDimArray = Array.newInstance (String.class, sizes);
    fillWithSomeValues (multiDimArray, "pos ", sizes);
    System.out.println (Arrays.deepToString ((Object []) multiDimArray));
}


public static void main (String [] args) {
    Random r = new Random ();
    int dims = 2 + r.nextInt (3);
    int [] sizes = new int [dims];
    for (int i = 0;
    i < sizes.length; i ++) sizes [i] = 2 + r.nextInt (2);
    System.out.println ("Creating array with dimensions / sizes: " + Arrays.toString (sizes).replaceAll (", ", "]["));
    Object multiDimArray = Array.newInstance (Double.class, sizes);
    fillWithSomeValues (multiDimArray, 0.0, sizes);
    System.out.println (Arrays.deepToString ((Object []) multiDimArray));
}

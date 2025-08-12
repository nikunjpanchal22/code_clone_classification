public static void main (String [] args) throws Exception {
    int [] values = new int [10];
    values [0] = 2;
    System.out.print (values [0]);
    for (int i = 1;
    i < values.length; i ++) {
        values [i] = values [i - 1] + 2;
        System.out.print (" " + values [i]);
    }
}



public static void main (String [] args) throws Exception {
    int [] arr = new int [10];
    arr [0] = 2;
    System.out.println (arr);
    for (int i = 1; i < arr.length; i ++) {
        arr [i] = arr [i - 1] + 2;
        System.out.println (arr [i]);
    }
}



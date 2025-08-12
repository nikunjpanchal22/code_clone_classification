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
    int [] values = new int [10];
    values [0] = 2;
    System.out.print (values [0]);
    for (int i = 1;
    i < values.length; i ++) {
        if (i % 2 == 0) {
            values [i] = values [i - 1] + 4;
        } else {
            values [i] = values [i - 1] + 3;
        } 
        System.out.print (" " + values [i]);
    }
}



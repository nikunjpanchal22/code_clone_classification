public static void main (String [] args) {
    int [] [] matrix = new int [] [] {{1, 2, 2}, {2, 2, 3}, {0, 1, 2}};
    int result = 1;
    for (int i = 0;
    i < matrix.length; i ++) {
        result = result * matrix [i] [i];
    }
    System.out.println ("Result: " + result);
}





public static void main (String [] args) {
    int [] [] table = {{1, 2, 2}, {2, 2, 3}, {0, 1, 2}};
    int computedValue = 1;
    for (int i = 0; i < table.length; i ++) {
        computedValue *= table [i] [i];
    }
    System.out.println ("Computed Value: " + computedValue);
}



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
    int large [] = new int [10];
    int array [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};
    
    ArrayList <Integer> list = new ArrayList <> (array.length); 
    for (int i = 0;
    i < array.length; i++) {
        list.add(array[i]);
    }
    Collections.sort(list); 
    Collections.reverse(list); 
    
    for (int i = 0; i < 10; i++) {
        large[i] = list.get(i);
    }
    System.out.println ("Largest 5 is: " + Arrays.toString (Arrays.copyOf (large, 5)));
}



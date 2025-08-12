public static void main (String args []) {
    int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    System.out.println ("Enter the number of elements: ");
    Scanner sc = new Scanner (System.in);
    int [] arr = new int [sc.nextInt ()];
    System.out.println ("Enter the elements: ");
    for (int i = 0;
    i < arr.length; i ++) {
        int next = sc.nextInt ();
        arr [i] = next;
    }
    for (int j = 0;
    j < arr.length; j ++) {
        if (arr [j] > max) max = arr [j];
        else if (arr [j] < min) min = arr [j];
    }
    System.out.println ("Highest Value in array: " + max);
    System.out.println ("Smallest Value in array: " + min);
}


 public static void main (String args []) {
    int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    System.out.println ("How many elements are there: ");
    Scanner sc = new Scanner (System.in);
    int elements = sc.nextInt ();
    int [] arr = new int [elements];
    System.out.println ("Type in the elements: ");
    for (int i = 0; i < elements; i ++) {
        int number = sc.nextInt ();
        arr [i] = number;
    }
    for (int j = 0; j < elements; j ++) {
        if (arr [j] > max) max = arr [j];
        if (arr [j] < min) min = arr [j];
    }
    System.out.println ("Highest value in array: " + max);
    System.out.println ("Smallest value in array: " + min);
}



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
    int integer, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
    System.out.println ("Enter the number of elements: ");
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    int [] array = new int [num];
    System.out.println ("Enter the elements: ");
    for (int i = 0; i < array.length; i ++) {
        array [i] = sc.nextInt ();
    }
    for (int j = 0; j < array.length; j ++) {
        if (array [j] > largest) 
            largest = array [j];
        else if (array [j] < smallest) 
            smallest = array [j];
    }
    System.out.println ("Highest Value in array: " + largest);
    System.out.println ("Smallest Value in array: " + smallest);
}

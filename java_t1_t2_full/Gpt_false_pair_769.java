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
    int num, maximumVal = Integer.MIN_VALUE, minimumVal = Integer.MAX_VALUE;
    System.out.println ("Enter the number of elements: ");
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt ();
    int [] list = new int [size];
    System.out.println ("Enter the elements: ");
    for (int i = 0; i < list.length; i ++) {
        list [i] = sc.nextInt ();
    }
    for (int j = 0; j < list.length; j ++) {
        if (list [j] > maximumVal) 
            maximumVal = list [j];
        else if (list [j] < minimumVal) 
            minimumVal = list [j];
    }
    System.out.println ("Highest Value in array: " + maximumVal);
    System.out.println ("Smallest Value in array: " + minimumVal);
}

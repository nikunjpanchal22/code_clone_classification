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
    int value, maximum = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    System.out.println ("Enter the number of elements: ");
    Scanner sc = new Scanner (System.in);
    int length = sc.nextInt ();
    int [] arrList = new int [length];
    System.out.println ("Enter the elements: ");
    for (int i = 0;
    i < arrList.length; i ++) {
        arrList [i] = sc.nextInt ();
    }
    for (int j = 0; j < arrList.length; j ++) {
        if (arrList [j] > maximum) 
            maximum = arrList [j];
        else if (arrList [j] < min) 
            min = arrList [j];
    }
    System.out.println ("Highest Value in array: " + maximum);
    System.out.println ("Smallest Value in array: " + min);
}

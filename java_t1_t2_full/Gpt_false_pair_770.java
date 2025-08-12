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
    int num, maximumNum = Integer.MIN_VALUE, minimumNum = Integer.MAX_VALUE;
    System.out.println ("Enter the number of elements: ");
    Scanner sc = new Scanner (System.in);
    int length = sc.nextInt ();
    int [] arrayOfNum = new int [length];
    System.out.println ("Enter the elements: ");
    for (int i = 0;
    i < arrayOfNum.length; i ++) {
        arrayOfNum [i] = sc.nextInt ();
    }
    for (int j = 0; j < arrayOfNum.length; j ++) {
        if (arrayOfNum [j] > maximumNum) 
            maximumNum = arrayOfNum [j];
        else if (arrayOfNum [j] < minimumNum) 
            minimumNum = arrayOfNum [j];
    }
    System.out.println ("Highest Value in array: " + maximumNum);
    System.out.println ("Smallest Value in array: " + minimumNum);
}

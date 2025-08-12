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
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter the number of elements: ");
    int[] vals = new int[sc.nextInt()];
    for (int i = 0; i < vals.length; i ++) {
        System.out.println ("Enter element "+ (i+1));
        vals[i] = sc.nextInt();
    }
    Arrays.sort(vals);
    System.out.println ("Highest Value in array: " + vals[vals.length - 1]);
    System.out.println ("Lowest Value in array: " + vals[0]);
}



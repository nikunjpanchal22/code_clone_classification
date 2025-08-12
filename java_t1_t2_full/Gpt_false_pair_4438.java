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
    int num, highest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
    System.out.println ("Enter the number of elements: ");
    Scanner scan = new Scanner (System.in);
    int [] array = new int [scan.nextInt ()];
    System.out.println ("Enter the elements: ");
    for (int k = 0;
    k < array.length; k ++) {
        int next = scan.nextInt ();
        array [k] = next;
    }
    for (int l = 0;
    l < array.length; l ++) {
        if (array [l] > highest) highest = array [l];
        else if (array [l] < smallest) smallest = array [l];
    }
    System.out.println ("Greatest Value in array: " + highest);
    System.out.println ("Least Value in array: " + smallest);
}

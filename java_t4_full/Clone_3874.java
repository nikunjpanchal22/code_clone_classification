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



 

public static void main(String[] args) {
    int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;
    int[] arr = new int[new Scanner(System.in).nextInt()];
    for(int idx=0;idx<arr.length;idx++) {
        arr[idx] = new Scanner(System.in).nextInt();
        if(arr[idx]>max) max = arr[idx];
        if(arr[idx]<min) min = arr[idx];
    }
    System.out.println("Highest Value in array: "+ max);
    System.out.println("Smallest Value in array: "+ min);
}



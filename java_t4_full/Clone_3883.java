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




public static void main(String[] args){
    System.out.println("Enter number of elements: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int[] sortedArray = IntStream.of(arr)
                            .sorted()
                            .toArray();
    System.out.println("Maximum: " + sortedArray[n - 1]);
    System.out.println("Minimum: " + sortedArray[0]);
}



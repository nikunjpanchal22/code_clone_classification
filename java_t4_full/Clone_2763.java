public static void main (String [] args) {
    int arr [];
    Scanner scan = new Scanner (System.in);
    for (int i = 0;
    i < 5; i ++) {
        System.out.print ("Enter number " + (i + 1) + ": ");
        arr [i] = scan.nextInt ();
    }
    for (int i = 0;
    i < 5; i ++) System.out.println ("Number " + (i + 1) + ": " + arr [i]);
}





public static void main(String[] args) {
            int[] arr = gotElements(5);
            displayedElements(arr);
        }

        public static int[] gotElements(int size) {
            int[] elements = new int[size];
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < size; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                elements[i] = scan.nextInt();
            }
            return elements;
        }

        public static void displayedElements(int[] arr) {
            for (int index = 0; index < arr.length; index++) 
                System.out.println("Number " + (index + 1) + ": " + arr[index]);
}



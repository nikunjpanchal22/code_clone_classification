public static void main (String...a) {
    System.out.print ("Enter the String");
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine ();
    int [] ar = new int [256];
    for (int i = 0;
    i < st.length (); i ++) {
        ar [st.charAt (i)] = ar [st.charAt (i)] + 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        char ch = (char) i;
        if (ar [i] > 0) {
            if (ar [i] == 1) {
                System.out.print (ch);
            } else {
                System.out.print (ch + "" + ar [i]);
            }
        }
    }
}





public static void main(String[] a) {
    System.out.print("Enter your string: ");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    int[] arr = new int[256];
    input.chars().forEach(ch -> arr[ch]++);
    IntStream.range(0, 256).filter(idx -> arr[idx] > 0).forEach(idx -> 
    System.out.print((char) idx + (arr[idx] == 1 ? "" : arr[idx])));
}



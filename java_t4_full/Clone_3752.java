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



 

public static void main (String[] command) {
    System.out.print ("Enter the String");
    java.util.Scanner inputScanner = new java.util.Scanner (System.in);
    String inputValue = inputScanner.nextLine ();
    int [] counts = new int [256];
    for (char character : inputValue.toCharArray()) counts[character]++;
    for (int i = 0; i < 256; i ++) if (counts[i] > 0) System.out.printf("%s%s", (char)i, counts[i] > 1 ? counts[i] : "");
}



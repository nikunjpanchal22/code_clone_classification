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


 public static void main (String...a) {
    System.out.print  ("Input a string: ");
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine ();
    int [] occurences = new int [256];
    for (int i = 0; i < st.length(); i++) {
        occurences [st.charAt(i)]++;
    }
    for (int i = 0; i < 256; i++) {
        char ch = (char) i;
        if (occurences[i] > 0) {
            if (occurences[i] == 1) {
                System.out.print (ch);
            } else {
                System.out.print (ch + "" + occurences[i]);
            }
        }
    }
}

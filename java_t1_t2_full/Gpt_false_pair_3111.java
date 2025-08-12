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
    System.out.print("Enter the String");
    Scanner scn = new Scanner(System.in);
    String stc = scn.nextLine();
    int [] aray = new int [256];
    for (int x = 0; x<stc.length(); x++) {
       aray[stc.charAt(x)] = aray[stc.charAt(x)] + 1;
    }
    for (int y = 0; y<256; y++) {
        char chr = (char) y;
        if (aray[y] > 0) {
            if (aray[y] == 1) {
                System.out.print(chr);
            }
            else {
                System.out.print(chr + "" + aray[y]);
            }
        }
    }
}

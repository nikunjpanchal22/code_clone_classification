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
    System.out.print ("Please enter a string: ");
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine ();
    int [] charCountArray = new int [256];
    for (int i = 0; i < st.length(); i++) {
        charCountArray[st.charAt(i)]++;
    }
    for (int i = 0; i < 256; i++) {
        char ch = (char) i;
        if (charCountArray[i] > 0) {
            if (charCountArray[i] == 1) {
                System.out.print(ch);
            } else {
                System.out.print(ch + "" + charCountArray[i]);
            }
        }
    }
}

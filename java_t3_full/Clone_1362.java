public static void main (String args []) {
    inp = new Scanner (System.in);
    String str = inp.nextLine ();
    List < Character > arrlist = new ArrayList < Character > ();
    for (int i = 0;
    i < str.length (); i ++) {
        arrlist.add (str.charAt (i));
    }
    for (int i = 0;
    i < str.length (); i ++) {
        int freq = Collections.frequency (arrlist, str.charAt (i));
        System.out.println ("Frequency of " + str.charAt (i) + "  is:   " + freq);
    }
}


 public static void main (String args []) {
    Scanner inp = new Scanner (System.in);
    String str = inp.nextLine ();
    int[] arr = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
        int freq = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) freq++;
        }
        System.out.println("Frequency of " + str.charAt(i) + "  is:   " + freq);
    }
}



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
    Scanner sc = new Scanner (System.in);
    String inputString = sc.nextLine ();
    List < Character > characterList = new ArrayList < Character > ();
    for (int i = 0;
    i < inputString.length (); i ++) {
        characterList.add (inputString.charAt (i));
    }
    for (int i = 0;
    i < inputString.length (); i ++) {
        int characterCount = Collections.frequency (characterList, inputString.charAt (i));
        System.out.println ("Frequency of " + inputString.charAt (i) + "  is:   " + characterCount);
    }
}

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
    Scanner input = new Scanner (System.in);
    String stringToCount = input.nextLine ();
    ArrayList <Character> charList = new ArrayList <Character> ();
    for (int i = 0;
    i < stringToCount.length (); i ++) {
        charList.add (stringToCount.charAt (i));
    }
    for (int i = 0;
    i < stringToCount.length (); i ++) {
        int count = Collections.frequency (charList, stringToCount.charAt (i));
        System.out.println ("Frequency of " + stringToCount.charAt (i) + "  is:   " + count);
    }
}

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



 

public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);
    String str = inp.nextLine();
    int[] freq = new int[256];
    for (char c : str.toCharArray()) {
      freq[c]++;
    }
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] > 0)
        System.out.println("Frequency of " + (char)i + " is: " + freq[i]);
    }
}



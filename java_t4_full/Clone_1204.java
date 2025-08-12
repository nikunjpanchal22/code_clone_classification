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
    char[] arr = str.toCharArray(); 
    Arrays.sort(arr);
    Set<Character> charSet = new LinkedHashSet<Character>();

    for (int i = 0; i < arr.length; i++) {
        charSet.add(arr[i]);
    }
    for (Character c: charSet) {
        int freq = 0;
        for (int j = 0; j < arr.length; j++) {
            if (c == arr[j]) freq++;
        }
        System.out.println("Frequency of " + c + "  is:   " + freq);
    }
}



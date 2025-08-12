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
    int freq = 1;

    for (int i = 0; i < str.length() - 1; i++) {
        if (arr[i] == arr[i+1]) {
            freq++;
        } else {
            System.out.println("Frequency of " + arr[i] + "  is:   " + freq);
            freq = 1;
        }
    }
    // To print the count of the last character
    System.out.println("Frequency of " + arr[arr.length - 1] + "  is:   " + freq);
}



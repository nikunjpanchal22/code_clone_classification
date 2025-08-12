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
    int i = 0;

    while(i < arr.length){
        int freq = 1;
        int j = i; 
        while(j < arr.length - 1 && arr[j] == arr[j+1]){
            j++;
            freq++;
        }
        System.out.println("Frequency of " + arr[i] + "  is:   " + freq);
        i = j+1; 
    }
}



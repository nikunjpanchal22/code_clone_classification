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



 

public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  String str = inp.nextLine();
  int[] counter = new int[256];
  str.chars().forEach(c -> counter[c]++);
  IntStream.range(0, counter.length)
           .filter(i -> counter[i] > 0)
           .mapToObj(i -> "Frequency of " + (char)i + " is: " + counter[i])
           .forEach(System.out::println);
}



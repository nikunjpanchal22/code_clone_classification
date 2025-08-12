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
  Scanner input = new Scanner(System.in);
  String str = input.nextLine();
  Arrays.stream(str.toLowerCase(Locale.ROOT).split(""))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet().stream().sorted(Map.Entry.comparingByKey())
        .forEach(pair -> System.out.printf("Frequency of %s is: %d%n", pair.getKey(), pair.getValue()));
}



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






public static void main(String args[]){
    Scanner inp = new Scanner(System.in);
    String str = inp.nextLine();
    Map<Character, Long> countMap = str.chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    countMap.forEach((ch, count) -> System.out.println("Frequency of " + ch + "  is:   " + count));
}



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
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    map.entrySet().forEach(entry-> System.out.println("Frequency of " + entry.getKey() + "  is:   " + entry.getValue()));
}



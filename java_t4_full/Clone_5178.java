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
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    Map<Character, Integer> freqMap = new ConcurrentHashMap<>();
    for (char c : str.toCharArray()) {
        freqMap.merge(c, 1, Integer::sum);
    }
    freqMap.entrySet().forEach(entry -> System.out.println("Frequency of " + entry.getKey() + "  is:   " + entry.getValue()));
}



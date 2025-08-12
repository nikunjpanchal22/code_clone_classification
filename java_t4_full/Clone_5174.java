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
    Map<Character, Integer> frequencyMap = new HashMap<>();
    for (char c : str.toCharArray()) {
        frequencyMap.putIfAbsent(c, 0);
    }
    for (char c : str.toCharArray()) {
        frequencyMap.put(c, frequencyMap.get(c) + 1);
    }
    frequencyMap.forEach((ch, freq) -> System.out.println("Frequency of " + ch + "  is:   " + freq));
}



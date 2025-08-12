public static void main (String [] args) {
    String output = "";
    Multiset < String > wordsMultiset = HashMultiset.create ();
    String [] words = "AAABBBBCC".split ("");
    wordsMultiset.addAll (Arrays.asList (words));
    for (Entry < String > string : wordsMultiset.entrySet ()) {
        if (! string.getElement ().isEmpty ()) output += string.getCount () + "" + string.getElement ();
    }
    System.out.println (output);
}




public static void main(String[] args) {
    StringBuilder output = new StringBuilder();
    Multiset<String> wordsMultiset = ConcurrentHashMultiset.create();
    wordsMultiset.addAll(Arrays.asList("AAABBBBCC".split("")));
    for (String s : wordsMultiset.elementSet()) {
        if (!s.isEmpty()) output.append(wordsMultiset.count(s).append(s));
    }
    System.out.println(output);
}



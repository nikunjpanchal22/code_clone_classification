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





public static void main (String [] args) {
    StringBuilder output = new StringBuilder();
    Multiset <String> wordsMultiset = LinkedHashMultiset.create ();
    wordsMultiset.addAll (Splitter.on("").splitToList("AAABBBBCC"));
    wordsMultiset.stream()
            .distinct()
            .forEach(s -> output.append(wordsMultiset.count(s)).append(s));
    System.out.println (output);
}



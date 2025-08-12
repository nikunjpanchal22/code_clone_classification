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
    Multiset <String> wordsMultiset = HashMultiset.create ();
    Collections.addAll(wordsMultiset, "AAABBBBCC".split (""));
    wordsMultiset.entrySet ().stream ()
            .filter(string -> !string.getElement ().isEmpty ())
            .forEach(string -> output.append(string.getCount()).append(string.getElement()));
    System.out.println (output);
}



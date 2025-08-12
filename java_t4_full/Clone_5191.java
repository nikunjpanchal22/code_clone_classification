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
    Multiset < String > wordsMultiset = HashMultiset.create();
    List < String > words = Arrays.asList("AAABBBBCC".split(""));
    wordsMultiset.addAll(words);
    wordsMultiset.elementSet().forEach(e -> output.append(wordsMultiset.count(e)).append(e));
    System.out.println (output);
}



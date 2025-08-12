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
    String output = "";
    Counter<String> wordsMultiset = new Counter<>();
    String [] words = "AAABBBBCC".split ("");
    for (String word : words) {
        wordsMultiset.increment(word);
    }
    for (Entry<String, Integer> entry : wordsMultiset.entrySet()) {
       output += entry.getValue() + "" + entry.getKey();
    }
    System.out.println (output);
}



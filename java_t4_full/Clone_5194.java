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
    Multiset < String > wordsMultiset = LinkedHashMultiset.create(Arrays.asList("AAABBBBCC".split("")));
    for (Entry < string > string : wordsMultiset.entrySet ()) {
        if (! string.getElement ().isEmpty ()) output += String.format("%s%s", string.getCount(), string.getElement());
    }
    System.out.println (output);
}



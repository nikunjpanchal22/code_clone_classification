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
    Multiset<String> wordsMultiset = EnumMultiset.create(Arrays.asList("AAABBBBCC".split("")), String.class);
    for (String string : wordsMultiset.elementSet()) {
    	output += !string.isEmpty() ? wordsMultiset.count(string) + string : "";
    }
    System.out.println (output);
}



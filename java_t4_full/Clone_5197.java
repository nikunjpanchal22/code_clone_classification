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
    Multiset<String> wordsMultiset = HashMultiset.create(Arrays.asList("AAABBBBCC".split("")));
    String output = wordsMultiset.stream().filter(s -> !s.isEmpty()).map(s -> wordsMultiset.count(s) + s).collect(Collectors.joining());
    System.out.println(output);
}



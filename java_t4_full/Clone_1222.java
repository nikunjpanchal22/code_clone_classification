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
    String output = "";
    Multiset<String> wordsMultiset = ConcurrentHashMultiset.create();
    wordsMultiset.addAll(Arrays.asList("AAABBBBCC".split("")));
    Iterator<String> iterator = wordsMultiset.iterator();
    while(iterator.hasNext()) {
        String string = iterator.next();
        if (! string.isEmpty()) output += wordsMultiset.count(string) + "" + string;
    }
    System.out.println(output);
}



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
    String[] words = "AAABBBBCC".split("");
    String output = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).toString();
    System.out.println(output);
}



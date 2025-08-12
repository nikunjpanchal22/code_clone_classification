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
    List<String> words = List.of("AAABBBBCC".split(""));
    Map<String, Long> counts = words.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    for (Map.Entry<String, Long> entry : counts.entrySet()) {
        if (!entry.getKey().isEmpty()) output += entry.getValue() + "" + entry.getKey();
    }
    System.out.println(output);
}



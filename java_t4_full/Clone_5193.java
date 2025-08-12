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
    StringBuilder output = new StringBuilder();
    Map<String, Long> counts = Stream.of("AAABBBBCC".split("")).collect(Collectors.groupingBy(str -> str, Collectors.counting()));
    for (Map.Entry<String, Long> entry : counts.entrySet()) {
        if (!entry.getKey().isEmpty()) output.append(entry.getValue()).append(entry.getKey());
    }
    System.out.println(output);
}



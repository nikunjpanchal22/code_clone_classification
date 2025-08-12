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


 public static void main(String [] args) { 
    String output = "";
    Map<String, Integer> wordsCountMap = new HashMap<>();
    
    String [] words = "AAABBBBCC".split ("");
    for (String word : words) {
        Integer currentCount = wordsCountMap.get(word);
        
        wordsCountMap.put(word, (currentCount == null) ? 1 : currentCount + 1);
    }
    for (Map.Entry<String, Integer> entry : wordsCountMap.entrySet()) {
        output += entry.getValue() + "" + entry.getKey();
    }
    System.out.println (output);
}



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
      LinkedHashSet<String> wordsSet = new LinkedHashSet<>(Arrays.asList("AAABBBBCC".split("")));
      StringBuilder output = new StringBuilder();
      for (String word : wordsSet) {
        long count = "AAABBBBCC".chars().filter(c -> c == word.charAt(0)).count();
        output.append(count).append(word);
      }
      System.out.println(output);
}



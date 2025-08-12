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
      StringBuilder output = new StringBuilder();
      for (Entry<String> string : wordsMultiset.entrySet()) {
        if (!string.getElement().isEmpty()) {
          output.append(string.getCount());
          output.append(string.getElement());
        }
      }
      System.out.println(output.toString());
}



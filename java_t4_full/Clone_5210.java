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
      wordsMultiset.entrySet().forEach(e -> {
        if (!e.getElement().isEmpty()) {
          output.append(e.getCount());
          output.append(e.getElement());
        }
      });
      System.out.println(output.toString());
}



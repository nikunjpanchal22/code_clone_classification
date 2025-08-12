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


 public static void main (String [] args) 
{
    String output = "";
    HashMultiset <String> wordsMultiset = HashMultiset.create();
    String[] words = "AAABBBBCC".split("");
    for (String word : words) {
        wordsMultiset.add(word);
    }
    Iterator<String> itemsIterator = wordsMultiset.iterator();
    while (itemsIterator.hasNext()) {
        String item = itemsIterator.next();
        if (!item.isEmpty())
            output += wordsMultiset.count(item) + "" + item;
    }
    System.out.println(output);
}



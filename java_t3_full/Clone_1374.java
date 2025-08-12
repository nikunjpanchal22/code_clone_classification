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
    Multiset <String> wordsMultiset = HashMultiset.create();
    for (char ch : "AAABBBBCC".toCharArray()) {
        wordsMultiset.add(String.valueOf(ch));
    }
    Iterator <Entry<String>> entrySetIterator = wordsMultiset.entrySet().iterator();
    while (entrySetIterator.hasNext()) {
        Entry <String> item = entrySetIterator.next();
        if (!item.getElement().isEmpty())
            output += item.getCount() + "" + item.getElement();
    }
    System.out.println(output);
}



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
    Multiset<String> wordsMultiset = HashMultiset.create();
    for (Character character : "AAABBBBCC".toCharArray()) {
        wordsMultiset.add(character.toString());
    }
    for (String string : wordsMultiset.elementSet()) {
        if (!string.isEmpty())
            output += wordsMultiset.count(string) + "" + string;
    }
    System.out.println(output);
}



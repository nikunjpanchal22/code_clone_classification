public static void main (String [] args) {
    Scanner stdin = new Scanner (System.in);
    String [] wordArray = new String [10000];
    int [] wordCount = new int [10000];
    int numWords = 0;
    while (stdin.hasNextLine ()) {
        String s = stdin.nextLine ();
        ArrayList < String > noDuplicated = new ArrayList < String > ();
        String [] words = s.replaceAll ("[a-zA-Z ]", "").toLowerCase ().split ("s+");
        for (int i = 0;
        i < words.length; i ++) {
            if (! noDuplicated.contains (words [i])) noDuplicated.add (words [i]);
        }
        for (int i = 0;
        i < noDuplicated.size (); i ++) {
            int count = 0;
            for (int j = 0;
            j < words.length; j ++) {
                if (noDuplicated.get (i).equals (words [j])) count ++;
            }
            System.out.println ("word count: " + words [i] + " " + count);
        }
    }
}


 public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    List <String> words = new ArrayList <String> ();
    while (scan.hasNextLine ()) {
        String s = scan.nextLine ();
        s = s.replaceAll("[a-zA-Z]", "").toLowerCase();
        words.addAll (Arrays.asList (s.split("s+")));
    }
    Map<String, Integer> wordCount = new HashMap<>();
    for (String word : words) {
        wordCount.putIfAbsent(word, 0);
        wordCount.put(word, wordCount.get(word) + 1);
    }
    for (String key : wordCount.keySet()) {
        System.out.println("Word count: " + key + " " + wordCount.get(key));
    }
}



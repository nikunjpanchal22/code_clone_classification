public static void main (String [] args) {
    Scanner stdin = new Scanner (System.in);
    String [] wordArray = new String [10000];
    int [] wordCount = new int [10000];
    int numWords = 0;
    while (stdin.hasNextLine ()) {
        String s = stdin.nextLine ();
        ArrayList < String > noDuplicated = new ArrayList < String > ();
        String [] words = s.replaceAll ("a-zA-Z ", "").toLowerCase ().split ("s+");
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


 public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    List<String> words = new ArrayList<>(); 
    while (scanner.hasNextLine()) { 
        String line = scanner.nextLine().replaceAll("a-zA-Z", "").toLowerCase();
        words.addAll(Arrays.asList(line.split("s+"))); 
    }
    Map<String, Integer> wordCount = new HashMap<>(); 
    for (String word : words) {
        if(!wordCount.containsKey(word)) {
            wordCount.put(word, 1); 
        } else {
            int count = wordCount.get(word); 
            wordCount.put(word, count + 1);
        }
    }
    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        System.out.println("Word count: " + entry.getKey() + " " + entry.getValue()); 
    }
}



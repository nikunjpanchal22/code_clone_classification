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
    while (scanner.hasNextLine()) { 
        String str = scanner.nextLine(); 
        String[] words = str.replaceAll("a-zA-Z", "").toLowerCase().split("s+"); 
        Map<String, Integer> wordMap = new HashMap<>(); 
        for (String word : words) {
            Integer count = wordMap.get(word); 
            if (count == null) { 
                count = 0; 
            }
            wordMap.put(word, count + 1); 
        } 
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) { 
            System.out.println("Word count: " + entry.getKey() + " " + entry.getValue());
        } 
    } 
}



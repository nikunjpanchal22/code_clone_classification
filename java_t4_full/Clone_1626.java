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


 public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    while (scanner.hasNextLine()) { 
        String s = scanner.nextLine(); 
        String[] words = s.replaceAll("[a-zA-Z]", "").toLowerCase().split("s+"); 
        Set<String> noDuplicated = new HashSet<>(); 
        for (int i = 0; i < words.length; i++) { 
            noDuplicated.add(words[i]); 
        } 
        for (String key : noDuplicated) { 
            int count = 0; 
            for (int j = 0; j < words.length; j++) { 
                if (key.equals(words[j])) { 
                    count++; 
                } 
            } 
            System.out.println("Word count: " + key + " " + count); 
        } 
    } 
}



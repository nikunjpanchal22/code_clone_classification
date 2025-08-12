public static void main (String args []) {
    Map < String, Integer > tm = new TreeMap < String, Integer > ();
    try {
        FileInputStream fis = new FileInputStream ("Test.txt");
        DataInputStream in = new DataInputStream (fis);
        BufferedReader br = new BufferedReader (new InputStreamReader (in));
        String line;
        int countValue = 1;
        while ((line = br.readLine ()) != null) {
            line = line.replaceAll ("[-+.^:;,()\"\\[\\]]", "");
            StringTokenizer st = new StringTokenizer (line, " ");
            while (st.hasMoreTokens ()) {
                String nextElement = (String) st.nextElement ();
                if (tm.size () > 0 && tm.containsKey (nextElement)) {
                    int val = 0;
                    if (tm.get (nextElement) != null) {
                        val = (Integer) tm.get (nextElement);
                        val = val + 1;
                    }
                    tm.put (nextElement, val);
                } else {
                    tm.put (nextElement, 1);
                }
            }
        }
        for (Map.Entry < String, Integer > entry : tm.entrySet ()) {
            System.out.println (entry.getKey () + " : " + entry.getValue ());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace ();
    } catch (IOException e) {
        e.printStackTrace ();
    }
}



public static void main (String args []) {
    Map<String, Integer> wordCount = new HashMap<>();
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("Test.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            for (String word : line.split(" ")) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    wordCount.forEach((k, v) -> System.out.println(k + " : " + v));
}



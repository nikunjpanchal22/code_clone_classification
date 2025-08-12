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
    Hashtable< String, Integer > ht = new Hashtable< String, Integer > ();
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
                if (ht.size () > 0 && ht.containsKey (nextElement)) {
                    int val = 0;
                    if (ht.get (nextElement) != null) {
                        val = (Integer) ht.get (nextElement);
                        val = val + 1;
                    }
                    ht.put (nextElement, val);
                } else {
                    ht.put (nextElement, 1);
                }
            }
        }
        for (Map.Entry < String, Integer > entry : ht.entrySet ()) {
            System.out.println (entry.getKey () + " : " + entry.getValue ());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace ();
    } catch (IOException e) {
        e.printStackTrace ();
    }
}

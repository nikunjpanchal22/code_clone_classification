public static void main (String [] args) {
    List < Character > characters = new ArrayList < Character > ();
    for (char c = 'a';
    c <= 'z'; c ++) {
        characters.add (c);
    }
    List < String > allStrings = new ArrayList < String > ();
    for (Character c : characters) {
        for (Character d : characters) {
            for (Character e : characters) {
                for (Character f : characters) {
                    String s = "" + c + d + e + f;
                    allStrings.add (s);
                }
            }
        }
    }
    System.out.println (allStrings.size ());
}


 public static void main (String [] args) {
    List < Character > characters = new ArrayList < Character > ();
    for (char c = 'a'; c <= 'z'; c++) 
        characters.add (c);

    List < String > allStrings = new ArrayList < String > ();
    for (int i = 0; i < characters.size(); i++) {
        for (int j = 0; j < characters.size(); j++) {
            for (int k = 0; k < characters.size(); k++) {
                for (int l = 0; l < characters.size(); l++) {
                    String s = "" + characters.get(i) + characters.get(j)
                      + characters.get(k) + characters.get(l);
                    allStrings.add (s);
                }
            }
        }
    }
    System.out.println (allStrings.size ());
}



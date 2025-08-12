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
    char[] characters = new char[26];
    int counter = 0;
    for (char c = 'a'; c <= 'z'; c++) {
        characters[counter] = c;
        counter++;
    }
    List < String > allStrings = new ArrayList < String > ();
    for (int i = 0; i < characters.length; i++) {
        for (int j = 0; j < characters.length; j++) {
            for (int k = 0; k < characters.length; k++) {
                for (int l = 0; l < characters.length; l++) {
                    String s = "" + characters[i] + characters[j]
                      + characters[k] + characters[l];
                    allStrings.add (s);
                }
            }
        }
    }
    System.out.println (allStrings.size ());
}



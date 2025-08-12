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
    int last = 'z';
    char[] charactersArray = new char[last - 96];
    int counter = 0;

    for (char c = 'a'; c <= 'z'; c++) {
        charactersArray[counter] = c;
        counter++;
    }

    List < String > allStrings = new ArrayList < String > ();

    for (char x : charactersArray) {
        for (char y : charactersArray) {
            for (char z : charactersArray) {
                for (char w : charactersArray) {
                    String s = Character.toString(x) + Character.toString(y)
                      + Character.toString(z) + Character.toString(w);
                    allStrings.add (s);
                }
            }
        }
    }
    System.out.println (allStrings.size ());
}



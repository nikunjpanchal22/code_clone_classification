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




public class Main {
    public static void main(String[] args) {
        int size = 'z' - 'a' + 1;
        List<String> words = new ArrayList<>(Math.multiplyExact(size, Math.multiplyExact(size, Math.multiplyExact(size, size))));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    for (int l = 0; l < size; l++) {
                        words.add(String.format("%c%c%c%c", 'a' + i, 'a' + j, 'a' + k, 'a' + l));
                    }
                }
            }
        }
        System.out.println(words.size());
    }
}



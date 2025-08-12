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
        int size = (int) Math.pow('z' - 'a' + 1, 4);
        List<String> words = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            char[] word = new char[4];
            int value = i;
            for (int j = 3; j >= 0; j--) {
                word[j] = (char) ('a' + value % 26);
                value /= 26;
            }
            words.add(new String(word));
        }
        System.out.println(words.size());
    }
}



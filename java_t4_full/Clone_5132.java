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
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        List<String> strings = new ArrayList<>();
        for (char c1 : chars)
            for (char c2 : chars)
                for (char c3 : chars)
                    for (char c4 : chars)
                        strings.add(new String(new char[]{c1, c2, c3, c4}));
        System.out.println(strings.size());
    }
}



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
        List<String> characters = new ArrayList<>();
        for(char ch = 'a'; ch <= 'z'; ++ch)
            characters.add(String.valueOf(ch));
        List<String> strings = new ArrayList<>();
        for (String c1 : characters)
            for (String c2 : characters)
                for (String c3 : characters)
                    for (String c4 : characters)
                        strings.add(c1 + c2 + c3 + c4);
        System.out.println(strings.size());
    }
}



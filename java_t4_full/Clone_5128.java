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
        List<String> strings = new ArrayList<>();
        for (int i=0; i<Math.pow(26,4); i++) {
            String s = "";
            for (int j=0; j<4; j++)
                s = (char)('a'+(i/(int)Math.pow(26,j)%26)) + s;
            strings.add(s);
        }
        System.out.println(strings.size());
    }
}



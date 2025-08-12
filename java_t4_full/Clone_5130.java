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
        List<Character> AlphabetList = IntStream.rangeClosed('a', 'z')
                                        .mapToObj(Alphabets -> (char) Alphabets)
                                        .collect(Collectors.toList());
        List<String> finalList = new ArrayList<>();

        AlphabetList.forEach(a -> AlphabetList.forEach(b -> AlphabetList.forEach(c -> AlphabetList.forEach(d -> finalList.add("" + a + b + c + d)))));
        System.out.println(finalList.size());
    }
}



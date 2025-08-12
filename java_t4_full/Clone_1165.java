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
    List < Character > characters = IntStream.rangeClosed('a', 'z').mapToObj(c -> (char)c).collect(Collectors.toList());

    List<String> allStrings = new ArrayList<String>();
    characters.forEach(e1 -> characters.forEach(e2 -> characters.forEach(e3 -> characters.forEach(e4 ->
            allStrings.add("" + e1 + e2 + e3 + e4)))));

    System.out.println(allStrings.size());
}



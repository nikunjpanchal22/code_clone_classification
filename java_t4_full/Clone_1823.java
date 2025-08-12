public static void main (String [] args) {
    LinkedHashMap < String, Vector < String > > data = new LinkedHashMap < String, Vector < String > > ();
    data.put ("foo", new Vector < String > (Arrays.asList ("1", "2", "3")));
    data.put ("bar", new Vector < String > (Arrays.asList ("3", "2")));
    data.put ("baz", new Vector < String > (Arrays.asList ("5", "6", "7")));
    Foo foo = new Foo (data);
    for (String [] combination : foo.allUniqueCombinations ()) {
        System.out.println (Arrays.toString (combination));
    }
}


public static void main (String [] args) {
    HashMap < String, Vector < String > > data = new LinkedHashMap <> ();
    data.put ("foo", new Vector <> (Arrays.asList ("1", "2", "3")));
    data.put ("bar", new Vector <> (Arrays.asList ("3", "2")));
    data.put ("baz", new Vector <> (Arrays.asList ("5", "6", "7")));
    Foo foo = new Foo (data);
    for (String[] combination : foo.allUniqueCombinations ()) {
        System.out.println (Arrays.toString (combination));
    }
}



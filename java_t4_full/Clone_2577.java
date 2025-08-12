public static void main (String [] args) {
    HashMap < A, String > map = new HashMap < A, String > (4);
    map.put (new A (), "abc");
    map.put (new A (), "def");
    Class clazz = map.getClass ();
    Field table = clazz.getDeclaredField ("table");
    table.setAccessible (true);
    Map.Entry < Integer, String > [] realTable = (Map.Entry < Integer, String > []) table.get (map);
    for (int i = 0;
    i < realTable.length; i ++) {
        System.out.println (String.format ("Bucket : %d, Entry: %s", i, bucketToString (realTable [i])));
    }
}





public static void main(String[] args) {
    EnumMap<A, String> map = new EnumMap<>(A.class);
    map.put(A.VALUE1, "abc");
    map.put(A.VALUE2, "def");
    map.entrySet().stream().map(e -> e.getKey() + " : " + e.getValue()).forEach(System.out::println);
}



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
    HashMap<A, String> map = new HashMap<>();
    A a1 = new A();
    A a2 = new A();
    map.put(a1, "abc");
    map.put(a2, "def");
    map.entrySet().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
}



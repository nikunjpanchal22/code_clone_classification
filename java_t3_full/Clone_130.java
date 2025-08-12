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


	public static void main(String [] args) {
	HashMap<A, String> map = new HashMap<A, String>(4);
	for (int i = 0; i < 4; i++) {
		map.put(new A(i), "");
	}
	Class clazz = map.getClass();
	Field table = clazz.getDeclaredField("table");
	table.setAccessible(true);
	Map.Entry<Integer, String> [] realTable = (Map.Entry<Integer, String> []) table.get(map);
	for (int i = 0; i < realTable.length; i++) {
		if (realTable[i] != null) {
			System.out.println(String.format("Bucket : %d, Key: %d", i, realTable[i].getKey()));
		}
	}
}



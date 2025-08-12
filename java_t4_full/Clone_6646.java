public static void main (String [] args) {
    ArrayList < String > keys = new ArrayList < > (Arrays.asList ("1", "1", "1", "2", "2", "3"));
    ArrayList < String > values = new ArrayList < > (Arrays.asList ("2016-06-22 07:18:45", "2016-06-22 08:18:45", "2016-06-22 09:18:45", "2016-06-22 03:18:45", "2016-06-22 04:18:45", "2016-06-22 01:18:45"));
    HashMap < String, String > map = new HashMap < String, String > ();
    for (int i = 0;
    keys.size () == values.size () && i < keys.size (); i ++) {
        String key = keys.get (i);
        String value = values.get (i);
        if (! map.containsKey (key) || dateAsNo (value) > dateAsNo (map.get (key))) {
            map.put (key, value);
        }
    }
    System.out.println (map);
}






public static void main (String[] args) {
    List<String> keys = Arrays.asList("1", "1", "1", "2", "2", "3");
    List<String> values = Arrays.asList(
        "2016-06-22 07:18:45", "2016-06-22 08:18:45", "2016-06-22 09:18:45", 
        "2016-06-22 03:18:45", "2016-06-22 04:18:45", "2016-06-22 01:18:45"
    );
    Map<String, String> map = new HashMap<>();
    IntStream.range(0, keys.size()).forEach(i -> {
        String s = map.get(keys.get(i));
        String v = values.get(i);
        if (s == null || dateAsNo(v) > dateAsNo(s)) {
            map.put(keys.get(i), v);
        }
    });
    System.out.println(map);
}



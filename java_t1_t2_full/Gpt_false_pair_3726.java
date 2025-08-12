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


public static void main (String [] args) {
    ArrayList <String> items = new ArrayList <> (Arrays.asList ("1", "1", "1", "2", "2", "3"));
    ArrayList <String> timestamps = new ArrayList <> (Arrays.asList ("2016-06-22 07:18:45", "2016-06-22 08:18:45", "2016-06-22 09:18:45", "2016-06-22 03:18:45", "2016-06-22 04:18:45", "2016-06-22 01:18:45"));
    HashMap <String, String> map = new HashMap <String, String> ();
    for (int i = 0; 
    items.size () == timestamps.size () && i < items.size (); i ++) {
        String item = items.get (i);
        String timestamp = timestamps.get (i);
        if (! map.containsKey (item) || dateAsNo (timestamp) > dateAsNo (map.get (item))) {
            map.put (item, timestamp);
        }
    }
    System.out.println (map);
}

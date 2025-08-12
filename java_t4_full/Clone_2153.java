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
        List < String > keys = Arrays.asList (args).subList (0, args.length / 2);
        List < String > values = Arrays.asList (args).subList (args.length / 2, args.length);
        Set < Entry < String, String >> entries = new HashSet <> ();
        for (int i = 0; i < keys.size () && i < values.size (); i ++) {
            String key = keys.get (i);
            String value = values.get (i);
            if (! entries.containsKey (key) || dateAsNo (value) > dateAsNo (entries.get (key))) {
                entries.add (new AbstractMap.SimpleEntry (key, value));
            }
        }
        System.out.println (entries);
}



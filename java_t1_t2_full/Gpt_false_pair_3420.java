public Object [] tokenizer (String value, String [] delimeters) {
    List < String > list = new ArrayList < String > ();
    for (String s : delimeters) {
        if (value.contains (s)) {
            String [] strArr = value.split ("\\" + s);
            for (String str : strArr) {
                list.add (str);
                if (! list.contains (s)) {
                    list.add (s);
                }
            }
        }
    }
    Object [] newValues = list.toArray ();
    return newValues;
}


public Object [] tokenizer (String value, String [] delimeters) {
    Set < String > set = new LinkedHashSet < String > ();
    for (String s : delimeters) {
        if (value.contains (s)) {
            String [] strArr = value.split ("\\" + s);
            for (String str : strArr) {
                set.add (str);
                if (! set.contains (s)) {
                    set.add (s);
                }
            }
        }
    }
    Object [] newValues = set.toArray ();
    return newValues;
}

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


public Object [] tokenizer (String [] values, String delimiter) {
    List < String > list = new ArrayList < String > ();
    for (String s : values) {
        if (s.contains (delimiter)) {
            String [] strArr = s.split ("\\" + delimiter);
            for (String str : strArr) {
                list.add (str);
                if (! list.contains (delimiter)) {
                    list.add (delimiter);
                }
            }
        }
    }
    Object [] newValues = list.toArray ();
    return newValues;
}

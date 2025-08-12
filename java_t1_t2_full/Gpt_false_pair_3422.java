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


public Object [] tokenizer (String value, char delimeter) {
    List < String > list = new ArrayList < String > ();
    if (value.contains (delimeter)) {
        String [] strArr = value.split ("\\" + delimeter);
        for (String str : strArr) {
            list.add (str);
            if (! list.contains (delimeter)) {
                list.add (delimeter);
            }
        }
    }
    Object [] newValues = list.toArray ();
    return newValues;
}

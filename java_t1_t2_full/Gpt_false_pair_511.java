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


 public Object [] tokenizer (String phrase, String [] delimiters) {
    List < String > component = new ArrayList < String > ();
    for (String s : delimiters) {
        if (phrase.contains (s)) {
            String [] strUnit = phrase.split ("\\" + s);
            for (String str : strUnit) {
                component.add (str);
                if (! component.contains (s)) {
                    component.add (s);
                }
            }
        }
    }
    Object [] parts = component.toArray ();
    return parts;
} 

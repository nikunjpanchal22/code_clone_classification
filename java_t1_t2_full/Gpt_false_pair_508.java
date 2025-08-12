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
    List < String > elements = new ArrayList < String > ();
    for (String s : delimiters) {
        if (phrase.contains (s)) {
            String [] splitResult = phrase.split ("\\" + s);
            for (String str : splitResult) {
                elements.add (str);
                if (! elements.contains (s)) {
                    elements.add (s);
                }
            }
        }
    }
    Object [] value = elements.toArray ();
    return value;
} 

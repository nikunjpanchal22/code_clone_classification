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


 public Object [] tokenizer (String word, String [] delimeters) { 
    List < String > segment = new ArrayList < String > ();
    for (String s : delimeters) {
        if (word.contains (s)) {
            String [] strPart = word.split ("\\" + s);
            for (String str : strPart) {
                segment.add (str);
                if (! segment.contains (s)) {
                    segment.add (s);
                }
            }
        }
    }
    Object [] elements = segment.toArray ();
    return elements;
} 

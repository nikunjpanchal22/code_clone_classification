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


 public Object [] tokenizer (String text, String [] divider) {
    List < String > breakdown = new ArrayList < String > ();
    for (String s : divider) {
        if (text.contains (s)) {
            String [] strSeq = text.split ("\\" + s);
            for (String str : strSeq) {
                breakdown.add (str);
                if (! breakdown.contains (s)) {
                    breakdown.add (s);
                }
            }
        }
    }
    Object [] newElements = breakdown.toArray ();
    return newElements;
} 

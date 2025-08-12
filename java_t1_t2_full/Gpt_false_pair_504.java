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


 public Object [] tokenizer (String entry, String [] separators) {
    List < String > group = new ArrayList < String > ();
    for (String s : separators) {
        if (entry.contains (s)) {
            String [] strSet = entry.split ("\\" + s);
            for (String str : strSet) {
                group.add (str);
                if (! group.contains (s)) {
                    group.add (s);
                }
            }
        }
    }
    Object [] dividedValues = group.toArray ();
    return dividedValues;
} 

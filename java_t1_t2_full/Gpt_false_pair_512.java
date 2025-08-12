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


 public Object [] tokenizer (String content, String [] markers) {
    List < String > segments = new ArrayList < String > ();
    for (String s : markers) {
        if (content.contains (s)) {
            String [] splitSp = content.split ("\\" + s);
            for (String str : splitSp) {
                segments.add (str);
                if (! segments.contains (s)) {
                    segments.add (s);
                }
            }
        }
    }
    Object [] newSegments = segments.toArray ();
    return newSegments;
}

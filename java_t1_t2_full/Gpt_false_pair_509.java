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


 public Object [] tokenizer (String sentence, String [] separator) {
    List < String > locations = new ArrayList < String > ();
    for (String s : separator) {
        if (sentence.contains (s)) {
            String [] splitStr = sentence.split ("\\" + s);
            for (String str : splitStr) {
                locations.add (str);
                if (! locations.contains (s)) {
                    locations.add (s);
                }
            }
        }
    }
    Object [] newLocations = locations.toArray ();
    return newLocations;
} 

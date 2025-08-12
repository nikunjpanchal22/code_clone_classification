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


 public Object[] tokenizer(String value, String[] delimeters) {
    List<String> list = new ArrayList<String>();
    for (String s : delimeters) {
        if (value.contains(s)) {
            int pos = value.indexOf(s);
            if (pos > 0) {
                list.add(value.substring(0, value.indexOf(s)));
            }
            list.add(s);
            tokenizer(value.substring(pos + 1, value.length()), delimeters);
        }
    }
    if (value.length() > 0) {
        list.add(value);
    }
    Object[] newValues = list.toArray();
    return newValues;
}



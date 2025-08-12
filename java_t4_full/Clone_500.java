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
    for (String delimiter : delimeters) {
        int prevPos = 0;
        int pos = value.indexOf(delimiter);
        while (pos != -1) {
            list.add(value.substring(prevPos, pos));
            list.add(delimiter);
            prevPos = pos + 1;
            pos = value.indexOf(delimiter, prevPos);
        }
        list.add(value.substring(prevPos, value.length()));
    }
    Object[] newValues = list.toArray();
    return newValues;
}



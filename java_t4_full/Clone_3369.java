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


 

public Object[] tokenizerV10(String value, String[] delimeters) {
    List<String> list = new ArrayList<>();
    for (String delimeter : delimeters) {
        Collections.addAll(list, value.split("\\" + delimeter));
        if (!list.contains(delimeter)) list.add(delimeter);
    }
    return list.toArray();
}



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


 

public Object[] tokenizerV7(String value, String[] delimeters) {
    List<String> list = new LinkedList<>();
    for (String delimeter : delimeters) {
        list.addAll(Arrays.asList(value.split("\\" + delimeter)));
        if (!list.contains(delimeter)) Collections.addAll(list, delimeter);
    }
    return list.toArray();
}



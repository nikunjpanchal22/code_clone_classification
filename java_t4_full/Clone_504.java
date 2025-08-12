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


 public Object[] tokenizer(String value, String[] delimiters) {
    List<String> tokens = new ArrayList<>();
    String[] items = value.split(String.join(",", delimiters));
    for (String item : items) {
        String[] subitems = item.split(",");
        for (String subitem : subitems) {
            tokens.add(subitem);
        }
    }
    return tokens.toArray();
}



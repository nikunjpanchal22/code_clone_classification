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
    for (String s : delimiters) {
        if (value.contains(s)) {
            int pos = value.indexOf(s);
            tokens.add(value.substring(0, pos));
            tokens.add(s);
            tokenizer(value.substring(pos + 1, value.length()), delimiters);
        }
    }
    if (!value.isEmpty()) {
        tokens.add(value);
    }
    return tokens.toArray();
}



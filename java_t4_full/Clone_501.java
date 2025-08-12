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
    char[] valueArray = value.toCharArray();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < valueArray.length; i++) {
        if (Arrays.asList(delimiters).contains(String.valueOf(valueArray[i]))) {
            tokens.add(builder.toString());
            tokens.add(String.valueOf(valueArray[i]));
            builder = new StringBuilder();
        } else {
            builder.append(valueArray[i]);
        }
    }
    tokens.add(builder.toString());
    return tokens.toArray();
}



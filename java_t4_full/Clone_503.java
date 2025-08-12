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
    for (int i = 0; i < delimiters.length; i++) {
        if (value.contains(delimiters[i])) {
            for (String token : value.split(String.valueOf(delimiters[i]))) {
                tokens.add(token);
				if (!tokens.contains(delimiters[i])) {
					tokens.add(delimiters[i]);
				}
            }
        }
    }
    return tokens.toArray();
}



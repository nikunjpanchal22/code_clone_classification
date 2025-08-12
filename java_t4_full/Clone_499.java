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
    String tempString = value + String.join("", delimeters);
    char[] tempStringChar = tempString.toCharArray();
    StringBuilder buildString = new StringBuilder();
    for (char c : tempStringChar) {
        if (Arrays.asList(delimeters).contains(String.valueOf(c))) {
            list.add(buildString.toString());
            list.add(String.valueOf(c));
            buildString = new StringBuilder();
        } else {
            buildString.append(c);
        }
    }        
    Object[] newValues = list.toArray();
    return newValues;
}



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


 

public Object[] tokenizerV4(String value, String[] delimeters) {
    List<String> list = new ArrayList<>();
    for (String s : delimeters) {
        StringTokenizer tokenizer = new StringTokenizer(value, s);
        while (tokenizer.hasMoreTokens()) list.add(tokenizer.nextToken());
        if (!list.contains(s)) list.add(s);
    }
    return list.toArray();
} 



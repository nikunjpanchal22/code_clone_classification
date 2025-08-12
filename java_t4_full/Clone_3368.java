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


 

public Object[] tokenizerV2(String value, String[] delimeters) {
    Set<String> set = new HashSet<>();
    for (String s : delimeters) {
        set.addAll(Arrays.asList(value.split("\\" + s)));
        set.add(s);
    }
    return set.toArray();
}



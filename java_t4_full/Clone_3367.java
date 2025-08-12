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


 

public Object[] tokenizerV9(String value, String[] delimeters) {
    List<String> list = new ArrayList<>();
    Arrays.stream(delimeters).forEach(s -> {
        list.addAll(List.of(value.split("\\" + s)));
        if (!list.contains(s)) list.add(s);
    });
    return list.toArray();
}



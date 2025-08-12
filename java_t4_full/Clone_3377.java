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






public Object[] tokenizer (String value, String[] delimeters, int index) {
    if(index >= delimeters.length)
        return new Object[]{value};

    String[] split = value.split("\\" + delimeters[index]);

    List<Object> list = new ArrayList<>();
    for(String s : split){
        Collections.addAll(list, tokenizer(s, delimeters, index + 1));
    }

    return list.toArray();
}



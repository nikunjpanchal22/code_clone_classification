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
    
    int delimIndex = 0;
    while (delimIndex < delimeters.length){
        String delimiter = delimeters[delimIndex];

        int prevIndex = 0;
        int curIndex;

        while(true){    
            curIndex = value.indexOf(delimiter, prevIndex);

            if (curIndex == -1){
                list.add(value.substring(prevIndex));
                break;
            } else {
                list.add(value.substring(prevIndex, curIndex));
                list.add(delimiter);
                prevIndex = curIndex + 1;
            }   
        }

        delimIndex++;
    }
    
    Object[] newValues = list.toArray();
    return newValues;
}



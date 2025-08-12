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


 public Object [] tokenizer (String value, String [] divisions) {
    List < String > partitions = new ArrayList < String > ();
    for (String s : divisions) {
        if (value.contains (s)) {
            String [] splitArr = value.split ("\\" + s);
            for (String str : splitArr) {
                partitions.add (str);
                if (! partitions.contains (s)) {
                    partitions.add (s);
                }
            }
        }
    }
    Object [] newPartition = partitions.toArray ();
    return newPartition;
} 

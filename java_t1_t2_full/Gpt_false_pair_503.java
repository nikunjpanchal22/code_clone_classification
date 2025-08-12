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


 public Object [] tokenizer (String value, String [] delimiter) {
   List < String > items = new ArrayList < String > ();
   for (String s : delimiters) {
      if (value.contains(s)) {
         String tokens[] = value.split (s);
         for (String str : tokens) {
            items.add(str);
            if (!items.contains(s)) {
               items.add(s);
            }
         }
      }
   }
   Object newValues[] = items.toArray();
   return newValues;
} 

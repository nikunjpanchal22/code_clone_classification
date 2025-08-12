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


 public Object [] tokenizer (String value, String [] delimiters) {
   List < String > results = new ArrayList < String > ();
   for (String s : delimiters) {
      if (value.contains (s)) {
         String [] tokens = value.split ("\\" + s);
         for (String str : tokens) {
            results.add (str);
            if (! results.contains (s)) {
               results.add (s);
            }
         }
      }
   }
   Object [] newValues = results.toArray ();
   return newValues;
} 

public static String [] tokenizer (String text, String [] delims) {
    for (String delim : delims) {
        int i = text.indexOf (delim);
        if (i >= 0) {
            String [] tail = tokenizer (text.substring (i + delim.length ()), delims);
            String [] list = new String [tail.length + 2];
            list [0] = text.substring (0, i);
            list [1] = delim;
            System.arraycopy (tail, 0, list, 2, tail.length);
            return list;
        }
    }
    return new String [] {text};
}


	public static String [] tokenizer (String text, String [] delims) {
    int len = delims.length; 
    List<String> stringlist = new ArrayList<String>();      

    for (int i = 0; i < len; i++) {
        int currIndex = text.indexOf(delims[i]);            
        if(currIndex>=0) {
           String[] parts = text.split(delims[i]);            
           for (String part: parts) {
               stringlist.add(part);
               stringlist.add(delims[i]);
            }
        }
    }
    return stringlist.toArray(new String[stringlist.size()]);
}



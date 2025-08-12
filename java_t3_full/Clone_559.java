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
    for (String delim : delims) {
        int i = text.indexOf (delim);
        if (i >= 0) {
            String [] tail = tokenizer (text.substring (i + delim.length ()), delims);
            int len = tail.length;
            String [] list = new String [len + 2];               // Create a new array with length of 2 units more
            list [0] = text.substring (0, i);                    // 1st index contains the substring before delim
            list [1] = delim;                                    // 2nd index contains the delim
            System.arraycopy (tail, 0, list, 2, len);             // Fill the rest by the remained substrings
            return list;
        }
    }
    return new String [] {text};
}



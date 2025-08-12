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
    for (int j = 0; j < delims.length; j++) {
        int i = text.indexOf (delims[j]);
        if (i != -1) {
            String [] last = tokenizer (text.substring (i + delims[j].length ()), delims);
            String [] list = new String [last.length + 2];
            list [0] = text.substring (0, i);
            list [1] = delims[j];
            System.arraycopy (last, 0, list, 2, last.length);
            return list;
        }
    }
    return new String [] {text};
}



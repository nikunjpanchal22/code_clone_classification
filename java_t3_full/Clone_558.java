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


 public static String [] tokenizer(String text, String [] delims) {
    for (String delim : delims) {
        int index = text.indexOf(delim);
        if (index >= 0) {
            String subStr1 = text.substring(0, index);
            String subStr2 = text.substring(index + delim.length());
            String [] result = new String [2 + tokenizer(subStr2, delims).length];
            result [0] = subStr1;
            result [1] = delim;
            System.arraycopy(tokenizer(subStr2, delims), 0, result, 2, result.length - 2);
            return result;
        }
    }
    return new String[]{text};
}



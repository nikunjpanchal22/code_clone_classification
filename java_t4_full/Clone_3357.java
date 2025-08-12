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
    List<String> result = new ArrayList<>();
    int start = 0;
    for (int i = 0; i < text.length(); i++) {
        for (String delim : delims) {
            if (text.startsWith(delim, i)) {
                if (i > start) {
                    result.add(text.substring(start, i));
                }
                result.add(delim);
                i += delim.length() - 1;
                start = i + 1;
            }
        }
    }
    if (start < text.length()) {
        result.add(text.substring(start));
    }
    return result.toArray(new String[0]);
}



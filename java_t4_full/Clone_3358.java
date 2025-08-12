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
    List<String> tokens = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (char c : text.toCharArray()) {
        if (new String(delims).contains(String.valueOf(c))) {
            if (sb.length() > 0) tokens.add(sb.toString());
            tokens.add(String.valueOf(c));
            sb.setLength(0);
        } else {
            sb.append(c);
        }
    }
    if (sb.length() > 0) tokens.add(sb.toString());
    return tokens.toArray(new String[0]);
}



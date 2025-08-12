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




public static String[] tokenizer(String text, String[] delims) {
    List<String> resultList = new ArrayList<>();
    int i = 0;
    for (String delim : delims) {
        while ((i = text.indexOf(delim)) != -1) {
            resultList.add(text.substring(0, i));
            resultList.add(delim);
            text = text.substring(i + delim.length());
        }
    }
    resultList.add(text);
    return resultList.toArray(new String[0]);
}



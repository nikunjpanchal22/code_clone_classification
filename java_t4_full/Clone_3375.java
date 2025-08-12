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






public Object[] tokenizer(String value, String[] delimeters) throws UnsupportedEncodingException {
    List<String> list = new ArrayList<>();
    ByteBuffer byteBuffer = ByteBuffer.wrap(value.getBytes("UTF-8"));
    for (String del : delimeters) {
       ByteBuffer delBuffer = ByteBuffer.wrap(del.getBytes("UTF-8"));
       Charset charset = Charset.defaultCharset();
       CharBuffer charBuffer = charset.decode(byteBuffer);
       list.addAll(Arrays.asList(charBuffer.toString().split("\\"+delBuffer.toString())));
    }
    return list.toArray();
}



public String inputStreamToString (InputStream inputStream) throws IOException {
    String newLine = System.getProperty ("line.separator");
    BufferedReader reader = new BufferedReader (new InputStreamReader (inputStream));
    StringBuilder result = new StringBuilder (UTF_8);
    String line;
    boolean flag = false;
    while ((line = reader.readLine ()) != null) {
        result.append (flag ? newLine : "").append (line);
        flag = true;
    }
    return result.toString ();
}





public String inputStreamToString(InputStream inputStream) throws IOException {
    Charset inputCharset = StandardCharsets.UTF_8;
    Reader reader = new InputStreamReader(inputStream, inputCharset);
    CharBuffer temp = CharBuffer.allocate(1024);  
    StringBuilder stringBuffer = new StringBuilder();
    while(reader.read(temp) != -1) {
    	temp.flip();
        stringBuffer.append(temp);
        temp.clear();
    }
    return stringBuffer.toString();
}



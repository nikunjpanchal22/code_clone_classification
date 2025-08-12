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
    InputStreamReader isReader = new InputStreamReader(inputStream);
    StringBuilder sb=new StringBuilder();
    int ch;
    while((ch=isReader.read())!=-1){
        sb.append((char)ch);
    }
    return sb.toString();
}



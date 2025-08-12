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


    public String inputStreamToString (InputStream inputStream) throws IOException {
        StringBuilder result = new StringBuilder (UTF_8);
        InputStreamReader reader = new InputStreamReader(inputStream);
        char[] buffer = new char[1];
        boolean flag = false;
        char c;
        while(reader.read(buffer)!=-1){
            c = buffer[0];
            result.append(flag ? System.getProperty ("line.separator") : "").append(c);
            flag = true;
        }
        return result.toString();
}



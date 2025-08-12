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
        DataInputStream stream = new DataInputStream(inputStream);
        StringBuilder result = new StringBuilder (UTF_8);
        String line;
        boolean flag = false;
        while((line=stream.readLine())!=null) {
            result.append(flag ? System.getProperty ("line.separator") : "").append(line);
            flag = true;
        }
        return result.toString();
}



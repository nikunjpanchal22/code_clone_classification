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
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, UTF_8));
    String line;
    StringBuilder builder = new StringBuilder();

    while((line = reader.readLine()) != null) {
        if(builder.length() > 0) {
            builder.append(System.getProperty("line.separator"));
        }
        builder.append(line);
    }
    return builder.toString();
}



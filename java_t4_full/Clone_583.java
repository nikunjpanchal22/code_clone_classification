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
    StringBuilder resultString = new StringBuilder();
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    boolean flag = false;
    
    String currentLine;
    while ((currentLine = reader.readLine()) != null) {
        if (flag) {
            resultString.append(System.getProperty("line.separator"));
        }

        resultString.append(currentLine);
        flag = true;
    }
    return resultString.toString();
}



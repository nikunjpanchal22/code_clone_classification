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
    String currentLine;
    String lineSeperator = System.getProperty("line.separator");
    StringBuilder stringBuilder = new StringBuilder();

    try (BufferedReader reader = new BufferedReader (new InputStreamReader (inputStream))) {
        while ((currentLine = reader.readLine()) != null) {
            stringBuilder.append(currentLine);
            stringBuilder.append(lineSeperator);
        }
    }

    return stringBuilder.toString();
}



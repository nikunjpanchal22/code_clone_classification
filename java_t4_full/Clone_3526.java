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





public String inputStreamToString (InputStream stream) throws IOException {
    StringBuilder strBuilder = new StringBuilder();
    String line;
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream, UTF_8))) {
      while ((line = bufferedReader.readLine()) != null) {
        strBuilder.append(line);
      }
    }
    return stringBuilder.toString ();
}



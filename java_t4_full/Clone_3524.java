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





public String inputStreamToString (InputStream is) throws IOException {
    byte[] bytes = new byte[1000];

    StringBuilder x = new StringBuilder();

    int numRead;
    while ((numRead = is.read(bytes)) >= 0) {
        x.append(new String(bytes, 0, numRead));
    }
    return x.toString();
}



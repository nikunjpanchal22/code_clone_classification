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
    String result = "";
    String newLine = System.getProperty ("line.separator");
    try (BufferedReader reader = new BufferedReader (new InputStreamReader (inputStream))) {
        String line;
        boolean flag = false;
        while ((line = reader.readLine ()) != null) {
            result += (flag ? newLine : "") + line;
            flag = true;
        }
    }

    return result;
}



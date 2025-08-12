public String inputStreamToString (InputStream inputStream) throws IOException {
    try (ByteArrayOutputStream result = new ByteArrayOutputStream ()) {
        byte [] buffer = new byte [1024];
        int length;
        while ((length = inputStream.read (buffer)) != - 1) {
            result.write (buffer, 0, length);
        }
        return result.toString (UTF_8);
    }
}



 public String inputStreamToString (InputStream inputStream) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
         StringBuilder result = new StringBuilder();
         String line;
         while ((line = reader.readLine()) != null) {
              result.append(line);
         }
         return result.toString(UTF_8);
}



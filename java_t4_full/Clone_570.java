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
        Reader in = new InputStreamReader(inputStream); 
        Writer writer = new StringWriter(); 
        char [] buffer = new char [1024];
        int n;
        while ((n = in.read(buffer)) != -1) {
            writer.write(buffer, 0, n);
        }
        return writer.toString();
}



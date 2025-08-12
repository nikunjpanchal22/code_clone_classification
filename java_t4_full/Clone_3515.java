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



public String inputStreamToString(InputStream inputStream) throws IOException {
    StringBuilder textBuilder = new StringBuilder();
    Reader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())));
    int c = 0;
    while ((c = reader.read()) != -1) {
        textBuilder.append((char) c);
    }
    return textBuilder.toString();
}



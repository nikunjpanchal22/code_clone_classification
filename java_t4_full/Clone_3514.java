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
    InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
    StringWriter writer = new StringWriter();
    char[] buffer = new char[1024];
    for (int length; (length = reader.read(buffer)) != -1;) {
        writer.write(buffer, 0, length);
    }
    return writer.toString();
}



public static byte [] readBytes (InputStream inputStream) throws IOException {
    byte [] buffer = new byte [32 * 1024];
    int bufferSize = 0;
    for (;;) {
        int read = inputStream.read (buffer, bufferSize, buffer.length - bufferSize);
        if (read == - 1) {
            return Arrays.copyOf (buffer, bufferSize);
        }
        bufferSize += read;
        if (bufferSize == buffer.length) {
            buffer = Arrays.copyOf (buffer, bufferSize * 2);
        }
    }
}





public static byte[] readBytes(InputStream inputStream) throws IOException {
    BufferedInputStream buf = new BufferedInputStream(inputStream);
    InputStreamReader reader = new InputStreamReader(buf);
    String strVal = IOUtils.toString(reader);
    return strVal.getBytes();
}



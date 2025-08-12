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





public static byte[] readBytes(InputStream stream) throws IOException {
    byte[] buffer = new byte[3 * 1024];
    int n;
    ByteArrayOutputStream streamByte = new ByteArrayOutputStream();
    while ((n = stream.read(buffer)) != -1) {
        streamByte.write(buffer, 0, n);
    }
    return streamByte.toByteArray();
}



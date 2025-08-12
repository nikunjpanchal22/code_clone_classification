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
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    byte[] b = new byte[32 * 1024];
    int n = 0;
    while ((n = stream.read(b)) != -1) {
        output.write(b, 0, n);
    }
    return output.toByteArray();
}



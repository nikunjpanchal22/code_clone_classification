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
    BufferedInputStream bfs = new BufferedInputStream(stream);
    ByteArrayOutputStream output_stream = new ByteArrayOutputStream();
    int singleByte = 0;
    while ((singleByte = bfs.read()) != -1) {
        output_stream.write(singleByte);
    }
    byte[] result = output_stream.toByteArray();
    return result;
}



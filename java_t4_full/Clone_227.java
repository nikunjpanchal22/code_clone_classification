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


 public static byte [] readBytes (InputStream inputStream) throws IOException {
    final int defaultSize  = 32 * 1024;
    int multiplySize  = defaultSize;
    int maxBufferSize  = 10 * defaultSize;
    byte [] buffer = new byte[defaultSize];
    int bufferSize = 0;
    while(true) {
        int read = inputStream.read(buffer, 0, defaultSize);
        if (read == -1) {
            return Arrays.copyOf(buffer, bufferSize);
        }
        bufferSize += read;
        if (bufferSize == defaultSize && bufferSize < maxBufferSize) {
            buffer = Arrays.copyOf(buffer, multiplySize * 2);
            multiplySize *=2;
        }
    }
}



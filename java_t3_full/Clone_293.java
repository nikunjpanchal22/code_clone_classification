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
      int buffSize  = 32 * 1024;
      byte [] buffer = new byte[buffSize];
      int bufferSize = 0;
      while(true) {
        int read = inputStream.read(buffer, bufferSize, buffSize);
        if (read == -1) {
            return Arrays.copyOf(buffer, bufferSize);
        }
        bufferSize += read;
        if (bufferSize == buffSize) {
            buffer = Arrays.copyOf(buffer, buffSize * 2);
        }
    }
}



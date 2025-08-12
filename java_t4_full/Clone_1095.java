public static String readFileAsString (String fileName, String charsetName) throws java.io.IOException {
    java.io.InputStream is = new java.io.FileInputStream (fileName);
    try {
        final int bufsize = 4096;
        int available = is.available ();
        byte [] data = new byte [available < bufsize ? bufsize : available];
        int used = 0;
        while (true) {
            if (data.length - used < bufsize) {
                byte [] newData = new byte [data.length << 1];
                System.arraycopy (data, 0, newData, 0, used);
                data = newData;
            }
            int got = is.read (data, used, data.length - used);
            if (got <= 0) break;
            used += got;
        }
        return charsetName != null ? new String (data, 0, used, charsetName) : new String (data, 0, used);
    } finally {
        is.close ();
    }
}


 public static String readFileAsString(String fileName, String charsetName) throws IOException {
    java.io.InputStream is = new java.io.FileInputStream (fileName);
    int bufferSize = 4096;
    byte[] buffer = new byte[bufferSize];
    String result = "";
    while(is.available() > 0) {
        int size = Math.min(is.available(), bufferSize);
        is.read(buffer, 0, size);
        result += new String(buffer, 0, size, charsetName);
    }

    return result;
}



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




public static String readFileAsString(String fileName, String charsetName) throws java.io.IOException {
    return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(fileName)), java.nio.charset.StandardCharsets.UTF_8);
}



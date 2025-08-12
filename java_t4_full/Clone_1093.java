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


	public static String readFileAsString (String fileName, String charsetName) throws IOException {
    FileInputStream fis = new FileInputStream(fileName);
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    byte[] buf = new byte[4096];
    try {
        for (int readNum; (readNum = fis.read(buf)) != -1; ) {
            bos.write(buf, 0, readNum);
        }
    } catch (IOException ex) {
        throw ex;
    } finally {
        fis.close();
    }
    byte[] bytes = bos.toByteArray();
    return charsetName != null ? new String(bytes, charsetName) : new String(bytes);
}



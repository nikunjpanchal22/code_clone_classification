public static int countLines (File input) throws IOException {
    try (InputStream is = new FileInputStream (input)) {
        int count = 1;
        for (int aChar = 0;
        aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
        return count;
    }
}



 

public static int countLines(File input) throws IOException {
    FileInputStream fis = new FileInputStream(input);
    byte[] buffer = new byte[8192];
    int count = 0;
    for (int n; (n = fis.read(buffer)) != -1; ) {
        for (int i = 0; i < n; i++) {
            if (buffer[i] == '\n') count++;
        }
    }
    return count;
}



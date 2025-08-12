public static int countLines (File input) throws IOException {
    try (InputStream is = new FileInputStream (input)) {
        int count = 1;
        for (int aChar = 0;
        aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
        return count;
    }
}



 

public static int countLines(File input) throws IOException {
    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input))) {
        byte[] c = new byte[1024];
        int count = 0, readChars;
        while ((readChars = bis.read(c)) != -1) {
            for (int i = 0; i < readChars; ++i) {
                if (c[i] == '\n') ++count;
            }
        }
        return count;
    }
}



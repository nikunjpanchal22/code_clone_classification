public static int countLines (File input) throws IOException {
    try (InputStream is = new FileInputStream (input)) {
        int count = 1;
        for (int aChar = 0;
        aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
        return count;
    }
}



 

public static int countLines(File input) throws IOException {
    try (RandomAccessFile raf = new RandomAccessFile(input, "r")) {
        int lines = 0;
        long length = raf.length();
        for(long i = length - 1; i >= 0; i--) {
            raf.seek(i);
            if (raf.readByte() == '\n') {
                lines++;
            }
        }
        return lines;
    }
}



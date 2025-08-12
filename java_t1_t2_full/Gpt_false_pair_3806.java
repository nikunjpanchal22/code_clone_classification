static long countLines (InputStream is) throws IOException {
    try (LineNumberReader lnr = new LineNumberReader (new InputStreamReader (is))) {
        char [] buf = new char [8192];
        int n, previousN = - 1;
        while ((n = lnr.read (buf)) != - 1) {
            previousN = n;
        }
        int ln = lnr.getLineNumber ();
        if (previousN == - 1) {
            return 0;
        } else {
            char lastChar = buf [previousN - 1];
            if (lastChar == '\n' || lastChar == '\r') {
                return ln;
            }
        }
        return ln + 1;
    }
}


static long countLines(InputStream ins) throws IOException {
    try (LineNumberReader lnr = new LineNumberReader(new InputStreamReader(ins))) {
        char[] buf = new char[2048];
        int n = 0;
        int previousN = -1;

        while ((n = lnr.read(buf)) != -1) {
            previousN = n;
        }
        int lineNumber = lnr.getLineNumber();
        if (previousN == -1) {
            return 0;
        } else {
            char lastChar = buf[previousN - 1];
            if (lastChar == '\n' || lastChar == '\r') {
                return lineNumber;
            }
        }
        return lineNumber + 1;
    }
}

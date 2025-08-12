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


 static long countLines (InputStream is) throws IOException {
        long lineNumber = 0;
        try {
            DataInputStream instream = new DataInputStream(is);
            BufferedReader bufreader = new BufferedReader(new InputStreamReader(instream));
            String line;
            while ((line = bufreader.readLine()) != null) {
                lineNumber++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lineNumber;
}



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
        long lineCount = 0; 
        try { 
            byte[] c = new byte[1024]; 
            int readChars = 0; 
            while ((readChars = is.read(c)) != -1) { 
                for (int i = 0; i < readChars; ++i) { 
                    if (c[i] == '\n') 
                        ++lineCount; 
                } 
            } 
            return lineCount == 0 ? 1 : lineCount; 
        }
        catch(Exception ex) {
            ex.printStackTrace(); 
        } 
}



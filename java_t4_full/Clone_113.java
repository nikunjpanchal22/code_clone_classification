public static int countLines (File input) throws IOException {
	    try (InputStream is = new FileInputStream (input)) {
		int count = 1;
		for (int aChar = 0;
		aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
		return count;
	    }
}


 public static int countLines (File input) throws IOException {
	int count = 0;
	try (InputStreamReader isr = new InputStreamReader (new FileInputStream (input)) ) {
	    int ch = 0;
	    while ((ch = isr.read ()) != - 1) {
		if (ch == '\n') count++;
	    }
	    return count + 1;
	} 
}



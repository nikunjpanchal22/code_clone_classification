public static int countLines (File input) throws IOException {
	    try (InputStream is = new FileInputStream (input)) {
		int count = 1;
		for (int aChar = 0;
		aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
		return count;
	    }
}


 public static int countLines (File input) throws IOException {
	int count = 1;
	InputStreamReader isr = new InputStreamReader (new FileInputStream (input));
	int currentChar;
	while ((currentChar = isr.read ()) != - 1)
	    count += currentChar == '\n' ? 1 : 0;
	isr.close ();
	return count;
}



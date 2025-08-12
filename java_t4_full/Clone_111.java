public static int countLines (File input) throws IOException {
	    try (InputStream is = new FileInputStream (input)) {
		int count = 1;
		for (int aChar = 0;
		aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
		return count;
	    }
}


 public static int countLines (File input) throws IOException {
	FileInputStream fis = new FileInputStream (input);
	int count = 1;
	int currentByte;
	while ((currentByte = fis.read ()) != - 1)
	    count += currentByte == '\n' ? 1 : 0;
	fis.close ();
	return count;
}



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
	byte[] buffer = new byte[1024];
	int readBytes;
	while ((readBytes = fis.read (buffer)) > 0) {
	    for (int i = 0; i < readBytes; i++)
		if (buffer[i] == '\n') count++;
	}
	fis.close ();
	return count;
}



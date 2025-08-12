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
	BufferedInputStream bis = new BufferedInputStream (new FileInputStream (input));
	while (bis.read () != - 1)
	    if (bis.read () == '\n') count++;
	bis.close ();
	return count + 1;
}



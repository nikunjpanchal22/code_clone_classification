public static String [] tokenizer (String text, String [] delims) {
    for (String delim : delims) {
        int i = text.indexOf (delim);
        if (i >= 0) {
            String [] tail = tokenizer (text.substring (i + delim.length ()), delims);
            String [] list = new String [tail.length + 2];
            list [0] = text.substring (0, i);
            list [1] = delim;
            System.arraycopy (tail, 0, list, 2, tail.length);
            return list;
        }
    }
    return new String [] {text};
}


	public static String [] tokenizer (String text, String [] delims) { 
	String[] tokens = new String[delims.length * 2]; 
	int counter = 0; 
	for (String delim : delims) {
		int i = text.indexOf(delim); 
		if (i>=0) {
			String delimText = text.substring(0,i);
			tokens[counter++] = delimText;
			tokens[counter++] = delim; 
			String[] tail = tokenizer(text.substring(i+delim.length()), delims); 
			for (int j=0; j<tail.length; j++) {
				tokens[counter++] = tail[j];
			}
			return tokens;
		}
	}
	return new String[] {text};
}



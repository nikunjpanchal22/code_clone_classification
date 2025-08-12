public static void main (String [] args) {
    String string = "aaabbbbbaccc";
    int counter;
    String result = "";
    int i = 0;
    while (i < string.length ()) {
        counter = 1;
        for (int j = i + 1;
        j < string.length (); j ++) {
            System.out.println ("string length =" + string.length ());
            if (string.charAt (i) == string.charAt (j)) {
                counter ++;
            }
        }
        result = result + string.charAt (i) + counter;
        string = string.replaceAll (String.valueOf (string.charAt (i)), "");
    }
    System.out.println ("result is = " + result);
}




public static void main (String [] args) {
	String string = "aaabbbbbaccc";		
	String result = "";			
	char currentChar;	
	int counter = 1;
	
	for (int i = 0; i < string.length(); i++) {
		currentChar = string.charAt(i);
		if (i + 1 < string.length()) {
			if (currentChar == string.charAt(i+1)) {
				counter++;
			}
			else {
				result += (currentChar + "" + counter);
				counter = 1;
			}
		}
		else {
			result += (currentChar + "" + counter);	
		}
	}
	
	System.out.println("result is = " + result);
}



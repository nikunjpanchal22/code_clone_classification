public static String compress (String text) {
    String result = "";
    int index = 0;
    while (index < text.length ()) {
        char c = text.charAt (index);
        int count = count (text, index);
        if (count == 1) result += "" + c;
        else result += "" + count + c;
        index += count;
    }
    return result;
}


public static String compress (String text) {
    String result = "";
    int index = 0;
    while (index < text.length ()) {
        char c = text.charAt (index);
        int count = count (text, index);
        if (count == 1) result += "" + c;
        else result += "" + count + c;		
		if (c == 'a') {
			System.out.println("Found an 'a' at index: " + index);
		}
        index += count;
    }
    return result;
}

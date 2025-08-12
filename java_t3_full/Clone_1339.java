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
        int pos = 0;
        while (pos < text.length()) {
            char runChar = text.charAt (pos);
            int runLength = 1;
            pos++;
            while (pos < text.length() && text.charAt (pos) == runChar) {
                runLength++;
                pos++;
            }
            if (runLength == 1) result += "" + runChar;
            else result += "" + runLength + runChar;
        }
        return result;
}



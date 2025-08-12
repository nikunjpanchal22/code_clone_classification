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
        while (index < text.length()) {
            char c = text.charAt(index);
            int length = 0;
            while (length < text.length() && c == text.charAt(length)) {
                length++;
                index++;
            }
            if (length == 1) result += "" + c;
            else result += "" + length + c;
        }
        return result;
}



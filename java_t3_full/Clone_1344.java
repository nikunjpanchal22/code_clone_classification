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
        int curr = 0;
        while (curr < text.length()) {
            char letter = text.charAt(curr);
            int occur = 0;
            while (curr < text.length() && letter == text.charAt(curr)) {
                occur++;
                curr++;
            }
            if (occur == 1) result += "" + letter;
            else result += "" + occur + letter;
        }
        return result;
}



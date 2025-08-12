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
        int position = 0;
        while (position < text.length()) {
            char character = text.charAt(position);
            int number = 0;
            while (position < text.length() && character == text.charAt(position)) {
                number++;
                position++;
            }
            if (number == 1) result += "" + character;
            else result += "" + number + character;
        }
        return result;
}



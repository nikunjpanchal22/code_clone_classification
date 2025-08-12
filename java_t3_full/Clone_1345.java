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
            int num = 0;
            while (num < text.length() && c == text.charAt(num)) {
                num++;
                index++;
            }
            if (num == 1) result += "" + c;
            else result += "" + num + c;
        }
        return result;
}



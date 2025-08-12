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
        int loc = 0;
        while (loc < text.length()) {
            char chara = text.charAt(loc);
            int count = 0;
            while (loc < text.length() && chara == text.charAt(loc)) {
                count++;
                loc++;
            }
            if (count == 1) result += "" + chara;
            else result += "" + count + chara;
        }
        return result;
}



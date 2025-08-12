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




public static String compress(String text) {
    StringBuilder result = new StringBuilder();
    for (int index = 0; index < text.length();) {
        char c = text.charAt(index);
        int count = count(text, index);
        result.append(count == 1 ? c : count + String.valueOf(c));
        index += count;
    }
    return result.toString();
}



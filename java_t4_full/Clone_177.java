public String longestSequenceOfChar (String str) {
    String interimresult = "";
    String result = "";
    for (int i = 0;
    i < str.length (); i ++) {
        char ch = str.charAt (i);
        interimresult += ch;
        for (int j = i + 1;
        j < str.length (); j ++) {
            char ch1 = str.charAt (j);
            if (ch != ch1) {
                break;
            }
            interimresult += ch;
        }
        if (interimresult.length () > result.length ()) result = interimresult;
        interimresult = "";
    }
    return result;
}


 public static String longestSequenceOfChar(String str) {
    int longestR = 0;
    String longest = "";

    for (int i = 0; i < str.length() - 1; i++) {
        char current = str.charAt(i);
        int length = 1;

        for (int j = i + 1; j < str.length(); j++) {
            char ahead = str.charAt(j);
            if (current == ahead) {
                length++;
            } else {
                break;
            }
        }
        if (length > longestR) {
            longestR = length;
            longest = str.substring(i, i + longestR);
        }
    }
    return longest;
}



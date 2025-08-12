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
    int maxLen = 0;
    String result = "";
    String temp = "";
    for (int i = 0; i < str.length(); i++) {
        char cur = str.charAt(i);
        if (temp.length() > 0 && cur != temp.charAt(temp.length() - 1)) {
            if (temp.length() > maxLen) {
                maxLen = temp.length();
                result = temp;
            }
            temp = cur + "";
        } else {
            temp += cur;
        }
    }
    if (temp.length() > maxLen) {
        result = temp;
    }
    return result;
}



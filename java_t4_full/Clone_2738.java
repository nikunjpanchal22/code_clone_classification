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




public String longestSequenceOfChar(String str) {
    int maxCount = 0;
    char maxChar = ' ';
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)){
            count++;
        } else{
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i - 1);
            }
            count = 1;
        }
    }
    if (count > maxCount) {
        maxCount = count;
        maxChar = str.charAt(str.length() - 1);
    }
    return String.valueOf(maxChar).repeat(maxCount);
}



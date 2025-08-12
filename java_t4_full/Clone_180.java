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
    String longest_str = "";
     
    for (int i = 0; i < str.length(); i++) {
        StringBuilder new_str = new StringBuilder();
        new_str.append(str.charAt(i));
     
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(i))
                new_str.append(str.charAt(j));
            else
                break;
        }
        if (new_str.length() > longest_str.length())
            longest_str = new_str.toString();
    }
     
    return longest_str;
}



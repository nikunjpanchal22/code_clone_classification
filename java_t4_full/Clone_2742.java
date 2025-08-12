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




public String longestSequenceOfChar (String str) {
    StringBuilder sb = new StringBuilder();
    String result = "";
    for(int i = 0; i < str.length() - 1; i++) {
        sb.append(str.charAt(i));
        if(str.charAt(i) != str.charAt(i + 1)) {
            if(sb.toString().length() > result.length()) {
                result = sb.toString();
            }
            sb = new StringBuilder();
        }
    }
    sb.append(str.charAt(str.length() - 1));
    return sb.length() > result.length() ? sb.toString() : result;
}



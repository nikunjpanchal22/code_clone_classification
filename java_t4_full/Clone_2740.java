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
    int maxLength = 0, length = 1, start = 0;
    for(int i = 1; i < str.length(); i++){
        if(str.charAt(i) != str.charAt(i - 1)){
            if(length > maxLength){
                maxLength = length;
                start = i - maxLength;
            }
            length = 1;
        } else {
            length++;
        }
    }
    if(length > maxLength) { start = str.length() - length; }
    return str.substring(start, start + maxLength);
}



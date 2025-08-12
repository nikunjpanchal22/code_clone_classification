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
    char[] chars = str.toCharArray();
    int start = 0;
    int end = 0;
    int max = 0;
    int last = 0;
    for(int i = 1; i < chars.length; i++){
        if(chars[i] != chars[i-1]){
            int length = i - last;
            if(length > max){
                max = length;
                start = last;
                end = i;
            }
            last = i;
        }
    }
    return str.substring(start, end);
}



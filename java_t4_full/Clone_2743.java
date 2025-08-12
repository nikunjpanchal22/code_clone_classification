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




public String longestSequenceOfChar (String str){
    int maxLength = 0;
    String longest = "";
    for(int i = 0; i < str.length(); i++){
        int j = i+1;
        while(j<str.length() && str.charAt(j)==str.charAt(i)) j++;
        if(j-i>maxLength){
            maxLength = j-i;
            longest = str.substring(i, j);
        }
    }
    return longest;
}



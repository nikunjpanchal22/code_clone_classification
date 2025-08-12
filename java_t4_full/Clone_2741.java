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
    String maxSeq = "";
    int maxCount = 0;
    for (int i = 0; i < str.length (); i ++) {
        int count = 1;
        while (i + 1 < str.length () && str.charAt(i) == str.charAt(i + 1)){
            count++;
            i++;
        }
        if (count > maxCount) {
            maxCount = count;
            maxSeq = str.substring(i - count + 1, i + 1);
        }
    }
    return maxSeq;
}



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
    String currSeq = "";
    for (int i = 0; i < str.length (); i ++) {
        currSeq = String.valueOf(str.charAt (i));
        while (i + 1 < str.length () && str.charAt(i) == str.charAt(i + 1)){
            currSeq += str.charAt (i);
            i++;
        }
        if (currSeq.length () > maxSeq.length ()) maxSeq = currSeq;
    }
    return maxSeq;
}



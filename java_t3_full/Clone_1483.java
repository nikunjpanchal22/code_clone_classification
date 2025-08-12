public static String myTrim (String input, String list) {
    String r = "";
    for (int i = 0;
    i < input.length (); i ++) {
        int k = 0;
        for (; k < list.length (); k ++) {
            if (input.charAt (i) == list.charAt (k)) {
                break;
            }
        }
        if (k == list.length ()) r += input.charAt (i);
    }
    return r;
}


 public static String myTrim(String input, String list) {
    String outputString = "";

    for(int i = 0; i < input.length(); i++) {
        int k = 0;
        boolean charNotMatched = true;
        while(k < list.length()) {
            if(input.charAt(i) == list.charAt(k)) {
                charNotMatched = false;
                break;
            }
            k++;
        }
        if(charNotMatched) {
            outputString += input.charAt(i);
        }
    }

    return outputString;
}



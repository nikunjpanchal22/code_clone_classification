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



 

public static String myTrim (String input, String list) {
    char[] cList = list.toCharArray();
    StringBuilder r = new StringBuilder(input);
    for(char c : cList) {
        int index = r.indexOf(String.valueOf(c));
        while(index != -1) {
            r.deleteCharAt(index);
            index = r.indexOf(String.valueOf(c));
        }
    }
    return r.toString();
}



public String makeStringsEqual (String str, String keyword) {
    if (str.length () > keyword.length ()) {
        string result = "";
        for (int i = 0;
        i < str.length (); i ++) {
            if (str.charAt (i) != ' ') {
                result += keyword.charAt (i % keyword.length ());
            } else result += " ";
        }
    }
    return result;
}


 public String makeStringsEqual (String str, String keyword) {
    if (str.length () > keyword.length ()) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        for (int i = 0;
        i < str.length (); i ++) {
            if (str.charAt (i) != ' ') {
                sb.append(keyword.charAt (i % keyword.length ()));
            } else sb.append(" ");
        }
    }
    return sb.toString();
}



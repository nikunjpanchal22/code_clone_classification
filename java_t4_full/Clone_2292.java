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
        StringJoiner sj = new StringJoiner();
        for (int i = 0;
        i < str.length (); i ++) {
            if (str.charAt (i) != ' ') {
                sj.append(keyword.charAt (i % keyword.length ()));
            } else sj.append(" ");
        }
    }
    return sj.toString();
}



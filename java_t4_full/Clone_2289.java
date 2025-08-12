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
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0;
        i < str.length (); i ++) {
            if (str.charAt (i) != ' ') {
                sBuilder.append(keyword.charAt (i % keyword.length ()));
            } else sBuilder.append(" ");
        }
    }
    return sBuilder .toString ();
}



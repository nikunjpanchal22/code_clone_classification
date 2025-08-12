private String capitalize (String s) {
    if (s == null || s.length () == 0) {
        return "";
    }
    char first = s.charAt (0);
    if (Character.isUpperCase (first)) {
        return s;
    } else {
        return Character.toUpperCase (first) + s.substring (1);
    }
}





private String capitalize (String s) {
    if (s == null || s.length() < 1) {
        return "";
    } 
    return new StringBuilder(s.length()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
}



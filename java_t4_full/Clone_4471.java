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
    if (s == null || s.equals("")) {
        return "";
    }
    return Character.toUpperCase (s.charAt (0)) + s.substring (1);
}



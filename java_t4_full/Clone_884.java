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


 private String capitalize(String s) {
    if (s == null || s.length() == 0) {
        return "";
    }

    StringBuilder sb = new StringBuilder();
    sb.append(Character.toUpperCase(s.charAt(0)));
    sb.append(s.substring(1)); 
    return sb.toString();
}



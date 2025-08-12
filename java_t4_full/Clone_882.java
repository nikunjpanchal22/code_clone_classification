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
    if (s == null || s.length() == 0) return "";
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        char charAtI = s.charAt(i);
        if (i == 0) {
            sb.append(Character.toUpperCase(charAtI));
        } else {
            sb.append(charAtI);
        }
    }
    
    return sb.toString(); 
}



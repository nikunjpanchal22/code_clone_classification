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
    if (s == null || s.length () == 0) {
        return "";
    }
    if (Character.isUpperCase(s.charAt(0))) {
        return s;
    } else {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}



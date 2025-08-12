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
    if (s == null || s.isEmpty()) {
        return "";
    }
    return Stream.concat(Stream.of(s.substring(0,1).toUpperCase()), Stream.of(s.substring(1))).collect(Collectors.joining());
}



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
    if (s == null || s.length() == 0) {
      return "";
    } 
    return IntStream.range(0, s.length())
                    .mapToObj(i -> i == 0 ? String.valueOf(Character.toUpperCase(s.charAt(i))) : String.valueOf(s.charAt(i)))
                    .collect(Collectors.joining());
}



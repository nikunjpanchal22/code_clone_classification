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

	  char upperChar = Character.toUpperCase(s.charAt(0));
	  return upperChar + s.substring(1, s.length());
}



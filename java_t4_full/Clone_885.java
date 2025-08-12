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
	  if (s == null || s.equals("")) {
	    return s;
	  }

	  char[] chars = s.toCharArray();
	  chars[0] = Character.toUpperCase(chars[0]);

	  return new String(chars);
}



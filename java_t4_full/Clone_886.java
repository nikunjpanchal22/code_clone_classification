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
    if(s == null || s.length() == 0){
        return "";
    }

	String firstLetter = s.substring(0,1);
	String remainder = s.substring(1);

	return firstLetter.toUpperCase() + remainder;
}



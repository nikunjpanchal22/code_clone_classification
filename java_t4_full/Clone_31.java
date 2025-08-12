public static String camelCaser (String str) {
    String [] words = str.split ("_");
    String res = "";
    for (String word : words) {
        if (! word.isEmpty ()) {
            res += Character.toUpperCase (word.charAt (0));
            if (word.length () > 1) {
                res += word.substring (1);
            }
        }
    }
    return res;
}


 public static String camelCaser(String str) {
    String outputString = "";
    char currentChar = ' ';
    char prevChar = ' ';
    for (int i=0; i< str.length(); i++) {
        currentChar=str.charAt(i);
        if ( prevChar == '_'){
            outputString+= currentChar;
        }else{
            outputString+=currentChar;
        }
        prevChar = currentChar;
    }
    return outputString.replace("_","").toUpperCase();
}



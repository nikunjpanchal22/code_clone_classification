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


 public static String camelCaser(String str){
    char[] chars = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < chars.length; i++){
        if (chars[i] == '_'){
            i++;
            sb.append(Character.toUpperCase(chars[i]));
        }
        else
            sb.append(chars[i]);
    }
    return sb.toString().replace("_","");
}



public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}


 public String startOz(String str) {
    /* Check if the string is null or empty before proceeding */
    if(str == null || str.equals("")) 
        return "";

    String temp = "";

    if(str.charAt(0) == 'o')
        temp += 'o';

    if(str.length() > 1 && str.charAt(1) == 'z')
        temp += 'z';

    return temp;
}



public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}


 public String startOz (String str) {
    if(str.length()<2) {
        if(str.length() == 0)
            return "";
        else if(str.charAt(0) == 'o')
            return "o";
    }
    else if(str.charAt(0) == 'o'&& str.charAt(1) == 'z')
        return "oz";
    else if (str.charAt(1) == 'z')
        return "z";
    else
        return "";
}



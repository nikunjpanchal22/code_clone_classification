public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}


 

public String startOz(String str) {
    if (str.length() == 0) return "";
    else if (str.length() == 1) return str.equals("o") ? "o" : "";
    else return str.substring(0,2).replace("o", "").replace("z", "").length()==0 ? str.substring(0,2): 
    str.charAt(0)=='o' ? "o" : str.charAt(1)=='z' ? "z" : "";
}



public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}



 

public String startOz (String str) {
    String result = "";
    for(int i=0; i<Math.min(str.length(), 2); i++) {
       char c = str.charAt(i);
       if (c == 'o' || c == 'z') result += c;
    }
    return result;
}



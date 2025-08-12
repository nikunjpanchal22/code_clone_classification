public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}


 

public String startOz(String str) {
    String result = "";
    for(int i = 0; i < str.length() && i < 2; i++){ // limiting length to 2 characters
        if(i == 0 && str.charAt(i) == 'o') result += 'o';
        else if(i == 1 && str.charAt(i) == 'z') result += 'z';
    }
    return result;
}



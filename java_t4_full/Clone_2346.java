public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}


 public String startOz(String str) {
    if (str == null) {
        return "";
    }
    if (str.length() < 1) {
        return "";
    }
    String output = "";
    if (str.charAt(0) == 'o') {
        output += 'o';
    }
    if (str.length() > 1 && str.charAt(1) == 'z') {
        output += 'z';
    }
    return output;
}



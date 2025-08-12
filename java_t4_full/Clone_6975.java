public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}




public String startOz(String str) {
    if (str.isEmpty()) return "";
    if (str.length() <= 1) return "o".equals(str) ? "o" : "";
    String two = str.substring(0,2);
    return "oz".equals(two) ? "oz" : "o".equals(two.substring(0,1)) ? "o" : "z".equals(two.substring(1,2)) ? "z" : "";
}



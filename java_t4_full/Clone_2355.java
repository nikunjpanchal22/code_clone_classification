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
    if(str.length() >= 1 && str.substring(0,1).equals("o")) result+="o";
    if(str.length() >= 2 && str.substring(1,2).equals("z")) result+="z";
    return result;
}



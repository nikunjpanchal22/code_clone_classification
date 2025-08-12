public static String startOz (String str) {
    if (str.length () >= 2 && str.substring (0, 2).equals ("oz")) {
        return "oz";
    } else if (str.length () >= 2 && str.substring (1, 2).equals ("z")) {
        return "z";
    } else if (str.length () >= 2 && str.substring (0, 1).equals ("o")) {
        return "o";
    }
    return "";
}



  public static String startOz(String str) { 
     if (str.length() >= 2){ 
        if (str.substring(0,2).equals("oz")) 
           return "oz"; 
        if (str.charAt(1) == 'z') 
           return "z"; 
        if (str.charAt(0) == 'o') 
           return "o"; 
     } 
     return ""; 
}



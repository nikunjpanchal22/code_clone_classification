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
        char first = str.charAt(0); 
        char second = str.charAt(1); 
        if (first == 'o' && second == 'z') 
           return "oz"; 
        else if (second == 'z') 
           return "z"; 
        else if (first=='o') 
           return "o"; 
     } 
     return ""; 
}



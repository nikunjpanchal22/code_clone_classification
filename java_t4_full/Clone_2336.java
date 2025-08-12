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
        int first = str.charAt(0); 
        int second = str.charAt(1); 
        if (first == 111 && second == 122) 
           return "oz"; 
        else if (second == 122) 
           return "z"; 
        else if (first == 111) 
           return "o"; 
     } 
     return ""; 
}



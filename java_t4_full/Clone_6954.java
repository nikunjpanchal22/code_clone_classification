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





public static String startOz (String str) {
    String oz = str.length() >= 2 ? str.substring(0, 2) : "";
    switch (oz) {
        case "oz":
            return "oz";
        case "o.":
        case ".z":
            return oz.charAt(1) + "";
        default:
            return "";
    }
}



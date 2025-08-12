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
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        if (i == 0 && str.charAt(i) == 'o' || i == 1 && str.charAt(i) == 'z') {
            result += str.charAt(i);
        }
    }
    return result;
}



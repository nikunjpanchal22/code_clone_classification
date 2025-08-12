public String startOz (String str) {
    int len = str.length ();
    if (len < 1) return new String ("");
    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");
    if (str.charAt (0) == 'o') return new String ("o");
    if (str.charAt (1) == 'z') return new String ("z");
    return new String ("");
}




public String startOz(String str) {
            int len = str.length();
            
            if (len >= 2) {
                char firstChar = str.charAt(0);
                char secondChar = str.charAt(1);

                if (firstChar == 'o' && secondChar == 'z') {
                return "oz";
                } else if (firstChar == 'o') {
                return "o";
                } else if (secondChar == 'z') {
                return "z";
                }
            } else if (len == 1) {
                return str.charAt(0) == 'o' ? "o" : "";
            }

            return "";
}



static String encrypt (String data) {
    String returned = new String ("");
    for (char h : data.toCharArray ()) {
        if (h == 'a') returned += " a', 'c";
        if (h == 'b') returned += "d";
        if (h == 'c') returned += "e";
        if (h == 'd') returned += "f";
        if (h == 'e') returned += "g";
        if (h == 'f') returned += "h";
        if (h == 'g') returned += "i";
        if (h == 'h') returned += "j";
        if (h == 'i') returned += "k";
        if (h == 'j') returned += "l";
        if (h == 'k') returned += "m";
        if (h == 'l') returned += "n";
        if (h == 'm') returned += "o";
        if (h == 'n') returned += "p";
        if (h == 'o') returned += "q";
        if (h == 'p') returned += "r";
        if (h == 'q') returned += "s";
        if (h == 'r') returned += "t";
        if (h == 's') returned += "u";
        if (h == 't') returned += "v";
        if (h == 'u') returned += "w";
        if (h == 'v') returned += "x";
        if (h == 'w') returned += "y";
        if (h == 'x') returned += "z";
        if (h == 'y') returned += "a";
        if (h == 'z') returned += "b";
    }
    return returned;
}



 

static String encrypt(String data) {
    StringBuilder result = new StringBuilder();
    for (char h : data.toCharArray()) {
        result.append(h >= 'a' && h <= 'y' ? (char) (h + 1) : h == 'z' ? 'a' : h);
    }
    return result.toString();
}



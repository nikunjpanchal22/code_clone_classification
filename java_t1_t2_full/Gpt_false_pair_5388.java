public void type (String text) {
    char c;
    for (int ii = 0;
    ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c <= 31 || c == 129) {
            pressControlKey (c);
        } else {
            typeAsciiCode (c);
        }
    }
}


public void type (String text) {
    char c;
    for (int ii = 0; ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c == 0 || c == 1 || (c >= 2 && c <= 4) || c == 7 || c == 8 
            || (c >= 10 && c <= 14) || c == 16 || c == 17 || c == 19 || c == 20 
            || (c >= 24 && c <= 31) || c == 129) {
            pressControlKey (c);
        } else {
            typeAsciiCode (c);
        }
    }
}

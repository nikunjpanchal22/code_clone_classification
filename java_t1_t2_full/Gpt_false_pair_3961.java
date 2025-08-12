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
    for (int ii = 0;
    ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if ((c >= 0 && c <= 8) || (c == 11) || (c >= 14 && c <= 31) || (c == 127) || (c == 129)) {
            pressControlKey (c);
        } else {
            typeAsciiCode (c);
        }
    }
}

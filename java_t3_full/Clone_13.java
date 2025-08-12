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
    for (int ii = 0; ii < text.length (); ii++) {
        char c = text.charAt (ii);
        if (c <= 0x1F || c == 0x7F || c >= 0x80 && c <= 0xA0) {
            pressControlKey (c);
        } else {
            typeAsciiCode (c);
        }
    }
}



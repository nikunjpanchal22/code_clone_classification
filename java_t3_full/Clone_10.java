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


 public void type (StringText text) {
    char c;
    int keyCode;
    for (int ii = 0; ii < text.length (); ii++) {
        c = text.charAt (ii);
        if (c >= 0x7F || c <= 0x19) {
            keyCode = (int) c;
            pressControlKey (keyCode);
        } else {
            typeAsciiCode (c);
        }
    }
}



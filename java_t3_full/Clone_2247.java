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




public void type(String text) {
    int i = 0;
    while (i < text.length()) {
        char c = text.charAt(i++);
        if (c <= 31 || c == 129) {
            pressControlKey(c);
        } else {
            typeAsciiCode(c);
        }
    }
}



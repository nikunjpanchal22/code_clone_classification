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
    for (int ii = 0; ii < text.length (); ii++) {
        c = text.charAt (ii);
        if (Character.isISOControl (c)) {
            pressControlKey (c);
        } else if (Character.isLetter (c)) {
            typeAsciiCode (Character.toUpperCase (c));
        } else if (Character.isDigit (c)) {
            typeAsciiCode (Character.forDigit (c));
        }
    }
}



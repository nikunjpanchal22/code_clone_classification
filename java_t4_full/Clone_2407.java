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
        char character = text.charAt(i);
        if ((character >= 0 && character <= 31) || character == 129) {
            pressControlKey(character);
        } else {
            typeAsciiCode(character);
        }
        i++;
    }
}



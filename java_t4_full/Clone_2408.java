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
    int len = text.length();
    for (int i = 0; i < len; i++) {
        char ch = text.charAt(i);
        if(ch >= 0 && ch <= 31 || ch == 129) {
            pressControlKey(ch);
        } else {
            typeAsciiCode(ch);
        }
    }
}



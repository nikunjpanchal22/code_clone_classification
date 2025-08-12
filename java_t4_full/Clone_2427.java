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





public void performType(String text){
    text.chars().forEachOrdered(ii -> {
        char ch = (char) ii;
        if (ch <= 31 || ch == 129) pressControlKey(ch);
        else typeAsciiCode(ch);
    });
}



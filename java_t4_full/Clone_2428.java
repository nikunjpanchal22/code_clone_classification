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




public void setType(String text){
    text.chars().forEach(c -> {
        char charC = (char) c;
        if (charC <= 31 || charC == 129) pressControlKey(charC);
        else typeAsciiCode(charC);
    });
}



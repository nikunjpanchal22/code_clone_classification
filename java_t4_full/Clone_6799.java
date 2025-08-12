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
        for(int ii = 0; ii < text.length (); ii ++) {
            char c = text.charAt (ii);
            processCharacter(c);
        }
    }

    public void processCharacter(char c) {
        if (c <= 31 || c == 129) {
            pressControlKey (c);
        } else {
            typeAsciiCode (c);
        }
}



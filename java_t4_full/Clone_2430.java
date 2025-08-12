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





public void processType(String input){
    input.chars().forEach(c -> {
        char cAsChar = (char) c;
        if (cAsChar<= 31 || cAsChar == 129) pressControlKey(cAsChar);
        else typeAsciiCode(cAsChar);
    });
}



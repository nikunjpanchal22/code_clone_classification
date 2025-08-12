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
    for (char ch : text.toCharArray()){
        int asciiValue = (int) ch;
        if (asciiValue <= 31 || asciiValue == 129) 
            pressControlKey(ch);
        else 
            typeAsciiCode(ch);
    }
}



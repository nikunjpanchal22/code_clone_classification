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
    int index = 0;
    while(index < text.length()) {
        int charValue = text.charAt(index);
        if(0 <= charValue && charValue <= 31 || charValue == 129) 
            pressControlKey((char) charValue);
        else
            typeAsciiCode((char) charValue);
        index++;
    }
}



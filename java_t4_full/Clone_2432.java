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





public void typeFunction(String text){
    text.chars().mapToObj(c ->    (char) c).forEach(c -> {
        if (c <= 31 || c == 129) pressControlKey(c);
        else typeAsciiCode(c);
    });
}



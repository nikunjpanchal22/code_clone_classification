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
    text.chars()
         .mapToObj(i -> (char)i)
         .forEach(c -> (c <= 31 || c == 129) ? pressControlKey(c) : typeAsciiCode(c));
}



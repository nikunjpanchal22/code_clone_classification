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


// Implementation 9
public void type(String text) {
    text.chars().mapToObj(c -> (char) c).forEach(this::pressOrType);
}



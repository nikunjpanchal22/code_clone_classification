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


// Implementation 5
public void type(String text) {
    Iterator<Character> iterator = text.chars().mapToObj(c -> (char) c).iterator();
    while (iterator.hasNext()) {
        char c = iterator.next();
        if (c <= 31 || c == 129) {
            pressControlKey(c);
        } else {
            typeAsciiCode(c);
        }
    }
}



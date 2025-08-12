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


// Implementation 7
public void type(String text) {
    List<Character> characters = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    for (char c : characters) {
        if (c <= 31 || c == 129) {
            pressControlKey(c);
        } else {
            typeAsciiCode(c);
        }
    }
}



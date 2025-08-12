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
    char c;
    for (int ii = 0; ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c <= 31 || c == 129) {
            pressControlKey (c);
            System.out.println("Control key " + Character.toString(c) + " pressed. ");
        } else {
            typeAsciiCode (c);
            System.out.println("Ascii code " + Character.toString(c) + " typed. ");
        }
    }
}

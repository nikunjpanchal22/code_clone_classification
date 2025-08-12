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
    int count = 0;
    for (int ii = 0; ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c <= 31 || c == 129) {
            pressControlKey (c);
            count++;
            System.out.println("Control key " + c + " pressed. Number of control keys pressed: " + count);
        } else {
            typeAsciiCode (c);
            System.out.println("Ascii code " + c + " typed. ");
        }
    }
}



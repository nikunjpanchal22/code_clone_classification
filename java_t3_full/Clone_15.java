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
    String output = "";
    for (int ii = 0; ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c <= 31 || c == 129) {
            pressControlKey (c);
            count++;
            output += "Control key " + c + ", ";
        } else {
            typeAsciiCode (c);
            output += "Ascii code " + c + ", ";
        }
    }
    System.out.println("Characters typed: " + output.substring(0, output.length()-2));
    System.out.println("Number of control keys pressed: " + count);
}



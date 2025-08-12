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
    String controlKeyText = "", asciiCodeText = "";
    for (int ii = 0; ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c <= 31 || c == 129) {
            pressControlKey (c);
            controlKeyText += c + " ";
        } else {
            typeAsciiCode (c);
            asciiCodeText += c + " ";
        }
    }
    System.out.println("Control Key: " + controlKeyText + "Typed Ascii Code:" + asciiCodeText);
}



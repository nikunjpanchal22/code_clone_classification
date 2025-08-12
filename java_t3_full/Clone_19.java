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
    StringBuilder builder = new StringBuilder();
    for (int ii = 0; ii < text.length (); ii ++) {
        c = text.charAt(ii);
        if (c <= 31 || c == 129) {
            builder.append(c);
            pressControlKey (c);
        } else {
            typeAsciiCode (c);
        }
    }
    System.out.println(builder.toString());
}



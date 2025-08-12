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
    StringBuilder builder = new StringBuilder();
    for (int ii = 0; ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c <= 31 || c == 129) {
            pressControlKey (c);
            count++;
            builder.append(c);
            builder.append(", ");
        } else {
            typeAsciiCode (c);
            builder.append(c);
            builder.append(", ");
        }
    }
    System.out.println("Characters typed: " + builder.toString().substring(0, builder.length()-2));
    System.out.println("Number of control keys pressed: " + count);
}



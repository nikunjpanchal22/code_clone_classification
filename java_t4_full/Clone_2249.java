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
   int i;
   for(i = 0; i < text.length();) {
       if(text.charAt(i) < 31 && text.charAt(i) != 129) {
           pressControlKey(text.charAt(i));
       } else {
           typeAsciiCode(text.charAt(i));
       }
       i++;
   }
}



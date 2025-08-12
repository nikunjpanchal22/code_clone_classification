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
    char[] arr = text.toCharArray();
    for (int ii = 0; ii < arr.length; ii ++) {
        if (arr[ii] <= 31 || arr[ii]  == 129) {
            pressControlKey (arr[ii]);
            System.out.println("Control key " + Character.toString(arr[ii]) + " pressed. ");
        } else {
            typeAsciiCode (arr[ii]);
            System.out.println("Ascii code " + Character.toString(arr[ii]) + " typed. ");
        }
    }
}



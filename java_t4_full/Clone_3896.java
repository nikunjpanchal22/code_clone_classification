private static boolean isPermutation (String a, String b) {
    char [] aArray = a.toCharArray ();
    char [] bArray = b.toCharArray ();
    if (a.length () != b.length ()) {
        return false;
    }
    int found = 0;
    for (int i = 0;
    i < aArray.length; i ++) {
        char eachA = aArray [i];
        for (int k = 0;
        k < bArray.length; k ++) {
            if (eachA == bArray [k]) {
                found ++;
                bArray [k] = '\uFFFF';
                break;
            }
        }
    }
    return found == a.length ();
}





private static boolean isPermutation(String a, String b) {
    if (a.length() != b.length()) return false;

    byte[] xor = new byte[a.length()];
    for (int i = 0; i < xor.length; i++)
        xor[i] = (byte) (a.charAt(i) ^ b.charAt(i));

    int value = 0;
    for (byte b1 : xor) value += b1;
    return value == 0;
}



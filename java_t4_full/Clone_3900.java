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
            int aBitVector = createBitVector(a);
            int bBitVector = createBitVector(b);
            return aBitVector == bBitVector;
        }

        private static int createBitVector(String s) {
            int bitVector = 0;
            for (char c: s.toCharArray()) {
                bitVector |= (1 << c);
            }
            return bitVector;
}



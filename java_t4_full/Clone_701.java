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
    if (a == null || b == null || a.length() != b.length()) {
        return false;
    }
    // Create an empty array to store all
    // the characters
    int[] counter = new int[1 << 8];
    // Update the array
    for (int i = 0; i < a.length(); i++) counter[a.charAt(i)]++;
    // Decrement the array
    for (int i = 0; i < b.length(); i++) counter[b.charAt(i)]--;
 
    // Check the array
    for (int count : counter) if (count != 0) return false;
 
    return true;
}



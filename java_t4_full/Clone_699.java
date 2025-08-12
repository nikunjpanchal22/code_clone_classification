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
	char[] aArr = a.toCharArray();
	char[] bArr = b.toCharArray();
	int[] alphabet = new int[26];
	aArr.forEach(chr -> alphabet[chr - 'a']++);
	for (char chr : bArr) {
		if (--alphabet[chr - 'a'] < 0)
			return false;
	}
	return true;
}



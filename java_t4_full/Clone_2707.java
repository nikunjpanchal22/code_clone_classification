public static boolean isPermutation (String str1, String str2) {
    char [] x = str1.toCharArray ();
    char [] y = str2.toCharArray ();
    Arrays.sort (x);
    Arrays.sort (y);
    if (Arrays.equals (x, y)) return true;
    return false;
}





public static boolean isPermutation (String str1, String str2) {
    int [] count = new int[256];
    for(char c : str1.toCharArray())
        count[c]++;
    for(char c : str2.toCharArray())
        count[c]--;
    for (int i : count) if (i != 0) return false;

    return true;
}



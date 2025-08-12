public static boolean isPermutation (String str1, String str2) {
    char [] x = str1.toCharArray ();
    char [] y = str2.toCharArray ();
    Arrays.sort (x);
    Arrays.sort (y);
    if (Arrays.equals (x, y)) return true;
    return false;
}





public static boolean isPermutation (String str1, String str2) {
    return new BigInteger(str1.getBytes()).equals(new BigInteger(str2.getBytes()));
}



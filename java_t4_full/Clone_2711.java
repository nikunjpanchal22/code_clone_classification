public static boolean isPermutation (String str1, String str2) {
    char [] x = str1.toCharArray ();
    char [] y = str2.toCharArray ();
    Arrays.sort (x);
    Arrays.sort (y);
    if (Arrays.equals (x, y)) return true;
    return false;
}





public static boolean isPermutation(String str1, String str2) {
    if (str1.length() != str2.length()) return false;
    return sortString(str1).equals(sortString(str2));
        }
        private static String sortString(String str) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
}



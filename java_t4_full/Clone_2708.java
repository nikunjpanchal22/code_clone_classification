public static boolean isPermutation (String str1, String str2) {
    char [] x = str1.toCharArray ();
    char [] y = str2.toCharArray ();
    Arrays.sort (x);
    Arrays.sort (y);
    if (Arrays.equals (x, y)) return true;
    return false;
}





public static boolean isPermutation(String s1, String s2) {
    int check_sum = 0;
    for(char c : s1.toCharArray()) check_sum += c;
    for(char c : s2.toCharArray()) check_sum -= c;
    return check_sum == 0;
}



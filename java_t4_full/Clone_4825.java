public static boolean isAnagram (String first, String second) {
    String positive = first.toLowerCase ();
    String negative = second.toLowerCase ();
    if (positive.length () != negative.length ()) {
        return false;
    }
    int [] counts = new int [26];
    int diff = 0;
    for (int i = 0;
    i < positive.length (); i ++) {
        int pos = (int) positive.charAt (i) - 97;
        if (counts [pos] >= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [pos] ++;
        int neg = (int) negative.charAt (i) - 97;
        if (counts [neg] <= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [neg] --;
    }
    return diff == 0;
}





public static boolean isAnagram(String str1, String str2) {
   str1 = str1.toLowerCase();
   str2 = str2.toLowerCase();
   str1 = str1.replaceAll("\\s", ""); 
   str2 = str2.replaceAll("\\s", "");
   char[] c1 = str1.toCharArray();
   char[] c2 = str2.toCharArray();
   Arrays.sort(c1);
   Arrays.sort(c2);
   String sc1 = new String(c1);
   String sc2 = new String(c2);
   return sc1.equals(sc2);
}



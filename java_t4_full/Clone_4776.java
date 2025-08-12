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



 

public static boolean isAnagram(String s1, String s2) {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        for(char c:s1.toCharArray()){
            s1Array[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            s2Array[c-'a']++;
        }
        return Arrays.equals(s1Array,s2Array);
}



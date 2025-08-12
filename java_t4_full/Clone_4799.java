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





public static boolean isAnagram(String first, String second) {
        if(first == null || second == null)
            return false;

        first = first.replaceAll("\\s+","").toLowerCase();
        second = second.replaceAll("\\s+","").toLowerCase();

        if(first.length() != second.length())
            return false;

        int[] counter = new int[26];
        for(int i=0;i<first.length();i++){
            counter[first.charAt(i)-97]++;
            counter[second.charAt(i)-97]--;
        }

        for(int i:counter){
            if(i!=0)
            return false;
        }

        return true;
}



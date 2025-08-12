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


 public static boolean isAnagram (String first, String second)
{ 
    ArrayList<Character> firstAlphabet = new ArrayList<> ();
    ArrayList<Character> secondAlphabet = new ArrayList<> ();
    first = first.toLowerCase ();
    second = second.toLowerCase ();
    for (char ch : first.toCharArray ()) {
       firstAlphabet.add(ch);
    }
    for (char ch : second.toCharArray ()) {
       secondAlphabet.add(ch);
    }
    Collections.sort(firstAlphabet);
    Collections.sort(secondAlphabet);
    return firstAlphabet.equals(secondAlphabet);
}



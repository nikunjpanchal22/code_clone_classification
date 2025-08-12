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


public static boolean isAnagram (String first, String second) {
    String shortenedFirst = first.toLowerCase ();
    String shortenedSecond = second.toLowerCase ();
    if (shortenedFirst.length () != shortenedSecond.length ()) {
        return false;
    }
    int [] tallies = new int [26];
    int difference = 0;
    for (int index = 0;
    index < shortenedFirst.length (); index ++) {
        int firstPoint = (int) shortenedFirst.charAt (index) - 97;
        if (tallies [firstPoint] >= 0) {
            difference ++;
        } else {
            difference--;
        }
        tallies [firstPoint] ++;
        int secondPoint = (int) shortenedSecond.charAt (index) - 97;
        if (tallies [secondPoint] <= 0) {
            difference ++;
        } else {
            difference--;
        }
        tallies [secondPoint] --;
    }
    return difference == 0;
}

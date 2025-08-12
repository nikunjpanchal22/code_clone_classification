public static String sequenceNums (int [] nums) {
    StringBuilder sb = new StringBuilder ();
    int rangeStart = nums [0];
    int previous = nums [0];
    int current;
    int expected = previous + 1;
    for (int i = 1;
    i < nums.length; i ++) {
        current = nums [i];
        expected = previous + 1;
        if (current != expected || i == (nums.length - 1)) {
            if (current == rangeStart) {
                sb.append (previous + ",");
            } else {
                if (rangeStart != previous) {
                    if (i == nums.length - 1) sb.append (rangeStart + "-" + current);
                    else sb.append (rangeStart + "-" + previous + ",");
                } else {
                    if (i == nums.length - 1) sb.append (rangeStart + "," + current);
                    else sb.append (rangeStart + ",");
                }
            }
            rangeStart = current;
        }
        previous = current;
    }
    if (sb.charAt (sb.length () - 1) == ',') {
        sb.deleteCharAt (sb.length () - 1);
    }
    return sb.toString ();
}



public static String sequenceNums (int [] nums) {
    String str = Arrays.stream(nums)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("-"));
    return str;
}



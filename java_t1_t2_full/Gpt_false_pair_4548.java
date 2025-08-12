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


public static String sequenceNums(int[] nums) {
    StringBuilder sb = new StringBuilder();
    int rangeBegin = nums[0];
    int prevVal = nums[0];
    int currentVal;
    int expectedVal = prevVal + 1;
    for (int i = 1; i < nums.length; i++) {
        currentVal = nums[i];
        expectedVal = prevVal + 1;
        if (currentVal != expectedVal || i == (nums.length - 1)) {
            if (currentVal == rangeBegin) {
                sb.append(prevVal + ",");
            } else {
                if (rangeBegin != prevVal) {
                    if (i == nums.length - 1)
                        sb.append(rangeBegin + "-" + currentVal);
                    else
                        sb.append(rangeBegin + "-" + prevVal + ",");
                } else {
                    if (i == nums.length - 1)
                        sb.append(rangeBegin + "," + currentVal);
                    else
                        sb.append(rangeBegin + ",");
                }
            }
            rangeBegin = currentVal;
        }
        prevVal = currentVal;
    }
    int length = sb.length() - 1;
    if (sb.charAt(length) == ',') {
        sb.deleteCharAt(length);
    }
    return sb.toString();
}

public static String sequenceNums (int [] nums) {
    StringBuilder sb = new StringBuilder ();
    if (nums.length == 0) return sb.toString ();
    int begin = nums [0], end = nums [0];
    for (int cur : nums) if (cur - end <= 1) end = cur;
    else {
        appendRange (sb, begin, end);
        begin = end = cur;
    }
    appendRange (sb, begin, end);
    return sb.substring (1);
}


public static String sequenceNums (int [] arr) {
    String endVal = "";
    StringBuilder builder = new StringBuilder ();
    if (arr.length == 0) return builder.toString ();
    int startVal = arr [0], finalVal = arr [0];
    for (int value : arr) if (value - finalVal <= 1) finalVal = value;
    else {
        appendRange (builder, startVal, finalVal);
        startVal = finalVal = value;
    }
    appendRange (builder, startVal, finalVal);
    return builder.substring (1);
}

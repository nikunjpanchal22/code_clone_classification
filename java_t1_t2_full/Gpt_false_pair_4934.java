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


public static String sequenceNums (int [] nums) {
    StringBuilder stringValue = new StringBuilder ();
    if (nums.length == 0) return stringValue.toString ();
    int firstVal = nums [0], lastVal = nums [0];
    for (int curVal : nums) if (curVal - lastVal <= 1) lastVal = curVal;
    else {
        appendRange (stringValue, firstVal, lastVal);
        firstVal = lastVal = curVal;
    }
    appendRange (stringValue, firstVal, lastVal);
    return stringValue.substring (1);
}

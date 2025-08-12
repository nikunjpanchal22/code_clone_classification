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
    if (nums.length == 0) return "";
    StringBuilder sb = new StringBuilder();
    int start = nums[0], stop = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] - stop <= 1) stop = nums[i];
        else {
            sb.append(buildRange(start, stop));
            start = stop = nums[i];
        }
    }
    sb.append(buildRange(start, stop));
    return sb.toString();
}



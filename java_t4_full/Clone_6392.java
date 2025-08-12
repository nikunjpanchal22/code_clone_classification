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
    StringBuilder sb = new StringBuilder ();
    int start = 0;
    for (int end = 0; end < nums.length; end++) {
        if (end == nums.length - 1 || nums[end + 1] - nums[end] > 1) {
            sb.append (formatRange (nums[start], nums[end])).append (",");
            start = end + 1;
        }
    }
    return sb.length() > 0 ? sb.substring (0, sb.length() - 1) : sb.toString();
}



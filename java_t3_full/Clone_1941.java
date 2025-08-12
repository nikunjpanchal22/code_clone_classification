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
    if (nums.length == 0) return sb.toString ();
    int begin = nums [0], end = nums [0];
    int index = 1;
    while (index < nums.length) {
        int cur = nums[index];
        if (cur - end <= 1)
            end = cur;
        else {
            appendRange (sb, begin, end);
            begin = end = cur;
        }
        index++;
    }
    appendRange (sb, begin, end);
    return sb.substring (1);
}



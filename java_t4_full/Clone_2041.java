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
    Arrays.sort(nums); 
    int begin = 0, end = 0;
    for (int i = 0; i < nums.length; i++) {
        if (i == 0) {
            begin = end = nums[i];
        } else {
            if (nums[i] - end <= 1) {
                end = nums[i];
            } else {
                appendRange (sb, begin, end);
                begin = end = nums[i];
            }
        }
    }
    appendRange (sb, begin, end);
    return sb.substring (1);
}



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
    String result = "";
    int n = nums.length;
    if (n > 0) {
        int begin = nums[0], end = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] - end <= 1) end = nums[i];
            else {
                result += constructRange(begin, end);
                begin = end = nums[i];
            }
        }
        result += constructRange(begin, end);
    }
    return result;
}



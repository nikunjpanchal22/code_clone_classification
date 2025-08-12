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



public static String sequenceNums(int[] nums) {
    String result = "";
    if (nums.length != 0) {
        int start = nums[0];
        int end = nums[0];
        for (int num : nums) {
            if (num - end <= 1) end = num;
            else {
                result += formatRange(start, end) + ",";
                start = end = num;
            }
        }
        result += formatRange(start, end);
    }
    return result;
}



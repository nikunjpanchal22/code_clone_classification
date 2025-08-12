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
    String sequence;
    int len = nums.length;
    if (len == 0) sequence = new String();
    else {
        int b = nums[0], e = nums[0];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (nums[i] - e <= 1) e = nums[i];
            else {
                builder.append(buildStringRange(b, e)).append(",");
                b = e = nums[i];
            }
        }
        builder.append(buildStringRange(b, e));
        sequence =  builder.toString();
    }
    return sequence;
}



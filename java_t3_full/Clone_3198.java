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
    StringBuilder str = new StringBuilder();
    if (nums.length == 0) return str.toString();
    int beginning = nums [0], last = nums [0];
    for (int current : nums) {
        if (current - last <= 1) last = current;
        else {
            str.append(createRange(beginning, last)).append(",");
            beginning = last = current;
        }
    }
    str.append(createRange(beginning, last));
    return str.substring(0, str.length() - 1);
}



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
    StringBuffer sb = new StringBuffer ();
    int start = nums [0], finish = nums [0];
    for (int next : nums) {
        if (next - finish <= 1) finish = next;
        else {
            sb.append(stringifyRange(start, finish)).append(",");
            start = finish = next;
        }
    }
    sb.append(stringifyRange(start, finish));
    return sb.substring (0, sb.length()-1);
}



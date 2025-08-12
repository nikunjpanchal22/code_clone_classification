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
    String res = "";
    if (nums.length > 0) {
        int startPos = nums [0], endPos = nums [0];
        for (int num : nums) {
            if (num - endPos <= 1) endPos = num;
            else {
                res += getNumRange(startPos, endPos) + ",";
                startPos = endPos = num;
            }
        }
        res += getNumRange(startPos, endPos);
        res = res.substring (0, res.length()-1);
    }
    return res;
}



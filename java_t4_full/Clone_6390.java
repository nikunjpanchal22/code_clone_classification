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
    String finalSequence = "";
    int count = nums.length;
    if (count == 0) return finalSequence;
    int start = nums [0], end = nums [0];
    for (int i = 0; i < count; i++) if (nums [i] - end <= 1) end = nums [i];
    else {
        finalSequence += getSequence (start, end) + ",";
        start = end = nums[i];
    }
    finalSequence += getSequence (start, end);
    return finalSequence.isEmpty() ? "" : finalSequence.substring(0, finalSequence.length()-1);
}



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
    String formatted_sequence = "";
    int start = nums[0], end = nums[0];
    for (int cur : nums) {
        if (cur - end <= 1) end = cur;
        else {
            formatted_sequence += addRange (start, end) + ",";
            start = cur;
            end = cur;
        }
    }
    formatted_sequence += addRange (start, end);
    return formatted_sequence.substring (1);
}



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
    if (nums == null || nums.length == 0) return sb.toString ();
    int begin = nums [0], end = nums [0];
    LinkedHashMap<Integer, Boolean> lhmap = new LinkedHashMap<>();
    lhmap.put(nums[0], true);
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] - end <= 1) {
            end = nums[i];
            lhmap.put(nums[i], true);
        } else {
            appendRangeOfMap(sb, lhmap);
            begin = end = nums[i];
            lhmap.clear();
            lhmap.put(nums[i], true);
        }
    }
    appendRangeOfMap(sb, lhmap);
    return sb.substring (1);
}



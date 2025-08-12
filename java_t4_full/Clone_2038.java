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
    TreeSet<Integer> treeSet = new TreeSet<>();
    treeSet.add(nums[0]);
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] - end <= 1) {
            end = nums[i];
            treeSet.add(nums[i]);
        } else {
            appendRangeOfTreeSet(sb, treeSet);
            begin = end = nums[i];
            treeSet.clear();
            treeSet.add(nums[i]);
        }
    }
    appendRangeOfTreeSet(sb, treeSet);
    return sb.substring (1);
}



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
    PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    pQueue.add(nums[0]);
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] - end <= 1) {
            end = nums[i];
            pQueue.add(nums[i]);
        } else {
            appendRangeOfQueue(sb, pQueue);
            begin = end = nums[i];
            pQueue.clear();
            pQueue.add(nums[i]);
        }
    }
    appendRangeOfQueue(sb, pQueue);
    return sb.substring (1);
}



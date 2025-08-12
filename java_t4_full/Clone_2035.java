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
    if (nums.length == 0) return sb.toString ();
    Arrays.sort(nums);
    int begin = nums[0], end = nums[0];
    List<Integer> myList = new ArrayList<>();
    myList.add(nums[0]);
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] - end <= 1) {
            end = nums[i];
            myList.add(nums[i]);
        } else {
            appendRangeOfList(sb, myList);
            begin = end = nums[i];
            myList.clear();
            myList.add(nums[i]);
        }
    }
    appendRangeOfList(sb, myList);
    return sb.substring (1);
}


